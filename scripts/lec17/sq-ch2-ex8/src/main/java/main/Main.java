package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;  // return x : x=> kiki 라는 parrot

        context.registerBean("parrot1", Parrot.class, parrotSupplier);  //동적으로 추가하는 방법 context에 parrot1 kiki 추가

//        context.registerBean("parrot1",
//                Parrot.class,
//                parrotSupplier,
//                bc -> bc.setPrimary(true));

        Parrot p = context.getBean("parrot1",Parrot.class);

        System.out.println(p.getName());
    }
}
