package proxies;

import model.Comment;

public interface CommentNotificationProxy { //comment를 외부 proxy에 전달함.

  void sendComment(Comment comment);
}
