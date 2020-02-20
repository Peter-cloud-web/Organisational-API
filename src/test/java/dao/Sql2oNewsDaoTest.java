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
    public void addingNewsSetsId() {
        News news = new News("tech","Baraks");;
        News news1 = new News("finance","mike");
        newsDao.add(news);
        newsDao.add(news1);
        assertEquals(2,newsDao.getAll().size());
    }

    @Test
    public void getAllNewsPublished() {
        News news = new News("tech","Baraks");
        News news1 = new News("finance","mike");
        newsDao.add(news);
        newsDao.add(news1);
        assertEquals(2,newsDao.getAll().size());
    }
    @Test
    public void addingNewsAndSetId() throws Exception {
        News news = new News("tech","Baraks");
        newsDao.add(news);
        assertEquals(0, news.getId());
    }
    @Test
    public void deleteNewsById() {
        News news = new News("tech","Baraks");
        News news1 = new News("science","Thomas");
        newsDao.deleteById(news1.getId());
        assertEquals(1,newsDao.getAll().size());
    }

    @Test
    public void clearAllNewsPublished() throws Exception{
        News news = new News("tech","Baraks");
        News new2 = new News("blockchain","simotoshi");
        newsDao.clearAll();
        assertEquals(0,newsDao.getAll().size());

    }
    @Test
    public void findNewsById() throws Exception{
        News news = new News("tech","Baraks");
        newsDao.add(news);
        News findNews = newsDao.findById(news.getId());
        assertEquals(findNews,newsDao.findById(news.getId()));
    }

}