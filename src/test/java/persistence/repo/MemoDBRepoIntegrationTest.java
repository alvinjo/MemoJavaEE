package persistence.repo;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import persistence.domain.Memo;
import persistence.domain.User;

import javax.inject.Inject;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class MemoDBRepoIntegrationTest {

    @Inject
    MemoDBRepo repo;



    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(MemoDBRepo.class)
                .addClass(Memo.class)
                .addClass(User.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void testAddUser(){
        String user = "{\"username\":\"two\",\"password\":\"jwo\"}";
        Assert.assertEquals("{\"message\":\"user added\"}", repo.addUser(user));
    }

}
