package main;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);  // context에 bean추가 .class 타입임에 주의

    Person person = context.getBean(Person.class);

    Parrot parrot = context.getBean(Parrot.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Parrot's name: " + parrot.getName());

    System.out.println("Person's parrot: " + person.getParrot()); // 아무 값도 추가되지 않았기에 null출력-> config 수정후 출력됨
  }
}
