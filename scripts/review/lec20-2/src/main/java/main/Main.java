package main;

import proxies.NotifyByMail;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();  //여기서 명시적으로 알려줌
        var notificationProxy = new NotifyByMail();

        var commentService = new CommentService(commentRepository,notificationProxy);   // 의존성 직접 주입
        var comment = new Comment();

        comment.setAuthor("jun");
        comment.setText("hi");

        commentService.publishComment(comment);
    }
}
