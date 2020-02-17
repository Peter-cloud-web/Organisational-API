package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class NewsTest {

    @Test
    public void getTopic() {
        News news = News.setUpNewNews();
        assertEquals("NEW CEO",news.getTopic());
    }

    @Test
    public void getWriter() {
        News news = News.setUpNewNews();
        assertEquals("peter",news.getWriter());

    }
}