package Main;

import Beans.Parrot;
import Beans.Person;
import Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person p = context.getBean(Person.class);   //getBean메서드는 class를 받아옴
        Parrot par = context.getBean(Parrot.class);

        System.out.println(""+p.getName());
        System.out.println(""+par.getName());

        System.out.println(""+p.getParrot());

    }
}
