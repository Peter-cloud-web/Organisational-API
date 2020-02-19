package dao;
import static org.junit.Assert.*;

import models.News;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static org.junit.Assert.*;


public class Sql2oNewsDaoTest {

    private Connection conn;
    private Sql2oNewsDao newsDao;

    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:h2:mem:testing;INIT=RUNSCRIPT from 'classpath:db/create.sql'";
        Sql2o sql2o = new Sql2o(connectionString, "sean", "access");
        newsDao = new Sql2oNewsDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);
        conn = sql2o.open();
    }
    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    @Test
    public void addingUsersSetsId() {
        News news = News.setUpNewNews();
        News news1 = News.setUpNewNews();
        assertEquals(2,newsDao.getAll().size());
    }

    @Test
    public void getAll() {
        News news = News.setUpNewNews();
        News news1 = News.setUpNewNews();
        assertEquals(2,newsDao.getAll().size());
    }

    @Test
    public void deleteById() {
        News news = News.setUpNewNews();
        News news1 = News.setUpNewNews();
        assertEquals(2,newsDao.getAll().size());
        newsDao.deleteById(news.getId());
        assertEquals(1,newsDao.getAll().size());

    }

    @Test
    public void clearAll() throws Exception{
        News news = News.setUpNewNews();
        News news1 = News.setUpNewNews();
        newsDao.clearAll();
        assertEquals(0,usersDao.getAll().size());

    }
}