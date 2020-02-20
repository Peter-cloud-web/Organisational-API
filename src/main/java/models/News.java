package models;

import java.util.Objects;

public class News {
    private String topic;
    private String writer;
    private int id;



    public News(String topic, String writer) {
        this.topic = topic;
        this.writer = writer;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return id == news.id &&
                topic.equals(news.topic) &&
                writer.equals(news.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, writer, id);
    }

    public static News setUpNewNews(){
        return new News(" THE NEW CEO","peter");
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

