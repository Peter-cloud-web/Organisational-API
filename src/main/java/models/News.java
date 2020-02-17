package models;

public class News {
    private String topic;
    private String writer;

    public News(String topic, String writer) {
        this.topic = topic;
        this.writer = writer;
    }

    public static News setUpNewNews(){
        return new News("NEW CEO","peter");
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
}

