package main;

public class Comment {  //의존성이 존재하지 않는 pojo class
    private String author;
    private String text;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }
}
