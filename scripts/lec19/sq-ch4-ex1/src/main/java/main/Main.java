package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

  public static void main(String[] args) {
    var commentRepository = new DBCommentRepository();  //여기서 인터페이스의 세부 구현 선택
    var commentNotificationProxy = new EmailCommentNotificationProxy(); //인터페이스의 세부 구현 선택

    var commentService = new CommentService(commentRepository,
                                            commentNotificationProxy);  // interface를 이용하여 구현에 맞는 service생성
                                                                        // 종속성 직접 주입 Spring과 다른 점 DI 를 직접 함

    var comment = new Comment();
    comment.setAuthor("Laurentiu");
    comment.setText("Demo comment");

    commentService.publishComment(comment);
  }
}
