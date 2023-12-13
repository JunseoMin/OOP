package model;

public class Comment {  //POJO 의존성이 존재하지 않는 오브젝트

  private String author;
  private String text;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
