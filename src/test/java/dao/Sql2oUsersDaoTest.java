package dao;

import static org.junit.Assert.*;

import models.Users;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2oUsersDaoTest {
    private Connection conn;
    private Sql2oUsersDao usersDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "sean", "access");
        usersDao = new Sql2oUsersDao(sql2o);
        usersDao = new Sql2oUsersDao(sql2o);
        conn = sql2o.open();
    }
    @After
    public void tearDown() throws Exception {
        conn.close();
    }
    @Test
    public void addingReviewSetsId() throws Exception {
        Users testUsers = Users.setUpNewUser();
        assertEquals(1, testUsers.getId());
    }
    @Test
    public void getAll() throws Exception{
        Users user1 = Users.setUpNewUser();
        Users user2 = Users.setUpNewUser();
        assertEquals(2,usersDao.getAll().size());

    }
    @Test
    public void deleteById() throws Exception{
        Users user1 = Users.setUpNewUser();
        Users user2 = Users.setUpNewUser();
        assertEquals(2,usersDao.getAll().size());
        usersDao.deleteById(user1.getId());
        assertEquals(1,usersDao.getAll().size());
    }
    @Test
    public void  clearAll() throws Exception{
        Users user1 = Users.setUpNewUser();
        Users user2 = Users.setUpNewUser();
        usersDao.clearAll();
        assertEquals(0,usersDao.getAll().size());

    }





}