package proxies;

import main.Comment;

public class NotifyByMail implements NotificationProxy {
    @Override
    public void notify(Comment comment){
        System.out.println("notify Mail");
    }
}
