package persistence.repo;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import persistence.domain.User;
import util.JSONUtil;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;


public class MemoDBRepoTest {

    static final String USER_JSON = "{\"userId\":1,\"username\":\"one\",\"password\":\"two\",\"memos\":[]}";
    static final User USER_OBJECT = new User();

    @Mock
    private EntityManager manager;

    @Mock
    JSONUtil util;


    @InjectMocks
    MemoDBRepo repo;


    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void getUserByIdTest(){
//        when(repo.getUserById(any(Long.class))).thenReturn()
        when(util.objToJson(any(Object.class))).thenReturn(USER_JSON);
//        assertThat(repo.getUserById(1L), is(USER_JSON));
        Assert.assertEquals(USER_JSON, repo.getUserById(1L));
    }


    @Test
    @Ignore
    public void getUserByName(){
        when(repo.getUserByName("one")).thenReturn(USER_JSON);
        assertEquals(USER_JSON, repo.getUserByName("one"));
    }


}