package business;

import persistence.repo.IMemoDBRepo;

import javax.inject.Inject;

public class Service {

    @Inject
    private IMemoDBRepo repo;

    public Service(){

    }

    public String getUsersAll(){return repo.getUsersAll();}

    public String getUsersNotes(Long userId){
        return repo.getUsersNotes(userId);
    }

    public String removeNote(Long id){ return repo.removeNote(id); }

    public String addNote(String memo){
        return repo.addNote(memo);
    }

    public String updateNote(String memo){
        return repo.updateNote(memo);
    }

    public String addUser(String userJson) { return repo.addUser(userJson);}

    public String removeUser(Long id) { return repo.removeUser(id);}

    public String updateUser(String userJson) { return repo.updateUser(userJson);}




}
