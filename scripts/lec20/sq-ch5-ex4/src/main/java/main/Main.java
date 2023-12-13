package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {

  public static void main(String[] args) {
    var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

    System.out.println("Before retrieving the CommentService");
    var service = c.getBean(CommentService.class);  //접근하지 않아서 출력되지 않음 @lazy  eager의 경우 before전에 한번 생성됨
    System.out.println("After retrieving the CommentService");
  }
}
