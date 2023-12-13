package repositories;

import model.Comment;

public interface CommentRepository {  //comment를 DB에 저장

  void storeComment(Comment comment);
}
