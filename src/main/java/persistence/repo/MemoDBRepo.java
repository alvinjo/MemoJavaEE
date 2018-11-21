package persistence.repo;

import persistence.domain.Memo;
import persistence.domain.User;
import util.JSONUtil;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.Collection;

import static javax.transaction.Transactional.TxType.SUPPORTS;
import static javax.transaction.Transactional.TxType.REQUIRED;

@Transactional(SUPPORTS)
@Default
public class MemoDBRepo implements IMemoDBRepo {


    @PersistenceContext(unitName = "primary")
    private EntityManager manager;

    @Inject
    private JSONUtil util;

    @Override
    public String getUsersAll() {
        Query query = manager.createQuery("select u from User u");
        Collection<User> userColl = query.getResultList();
        return util.objToJson(userColl);
    }

    @Override
    public String getUserByName(String user){
        TypedQuery<User> query = manager.createQuery("select u from User u where u.username = '" + user + "'", User.class);
        Collection<User> userColl = query.getResultList();
        return util.objToJson(userColl);
    }

    @Override
    public String getUserById(Long userId) {
        return util.objToJson(findUser(userId));
    }


    @Transactional(REQUIRED)
    @Override
    public String addUser(String userJson) {
        manager.persist(util.jsonToObj(userJson, User.class));
        return "{\"message\":\"user added\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String removeUser(Long id) {
        manager.remove(findUser(id));
        return "{\"message\":\"user removed\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String updateUser(String userJson) {
        User updated = util.jsonToObj(userJson, User.class);
        User userDB = findUser(updated.getId());
        userDB.setPassword(updated.getPassword());
        return "{\"message\":\"user updated\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String removeNote(Long id) {
        manager.remove(findMemo(id));
        return "{\"message\":\"note removed\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String addNote(String memo) {
        manager.persist(util.jsonToObj(memo, Memo.class));
        return "{\"message\":\"note added\"}";
    }

    @Transactional(REQUIRED)
    @Override
    public String updateNote(String memo) {
        Memo updated = util.jsonToObj(memo, Memo.class);
        Memo memoDB = findMemo(updated.getId());
        memoDB.setNote(updated.getNote());
        return "{\"message\":\"note updated\"}";
    }

    private User findUser(Long id ){
        return manager.find(User.class, id);
    }

    private Memo findMemo(Long id){
        return manager.find(Memo.class, id);
    }
}
