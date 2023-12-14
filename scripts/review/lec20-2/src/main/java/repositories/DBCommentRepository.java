package repositories;

import main.Comment;

public class DBCommentRepository implements CommentRepository {
    @Override
    public void storeComments(Comment comment){ //public void로 하여야 함
        System.out.println("stored!");
    }

}
