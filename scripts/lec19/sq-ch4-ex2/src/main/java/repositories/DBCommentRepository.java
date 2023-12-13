package repositories;

import model.Comment;
import org.springframework.stereotype.Component;

@Component  // 스테레오 타입 어노테이션
public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
}
