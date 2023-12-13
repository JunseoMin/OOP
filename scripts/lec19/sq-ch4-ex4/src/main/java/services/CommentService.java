package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {

  @Autowired  // 종속성을 내부 인스턴스에 설정하여 Bean을 이용하여 종속성 주입이 가능해짐
  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy;

  public CommentService(CommentRepository commentRepository,
                        CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
