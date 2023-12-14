package services;

import main.Comment;
import proxies.NotificationProxy;
import repositories.CommentRepository;

public class CommentService {

    private final CommentRepository CommentRepository;
    private final NotificationProxy notificationProxy;

    public CommentService(CommentRepository cmr, NotificationProxy notificationProxy){
        this.CommentRepository = cmr;
        this.notificationProxy = notificationProxy;
    }

    public void publishComment(Comment comment){
        CommentRepository.storeComments(comment);
        notificationProxy.notify(comment);
    }
}
