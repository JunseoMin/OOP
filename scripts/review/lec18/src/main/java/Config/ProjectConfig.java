package Config;

import Beans.Parrot;
import Beans.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "Beans")
public class ProjectConfig {

    @Bean
    public Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("koko");

        return p;   // Parrot 객체를 리턴하는 bean메서드
    }
    @Bean
    public Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("koka");

        return p;   // Parrot 객체를 리턴하는 bean메서드
    }

    @Bean
    public Person person(){
        Person p;
        p = new Person(@Qualifier("parrot2") Parrot parrot);
        p.setName("Jun");
        p.setParrot(parrot);  // direct wiring, 두번 생셩되는것이 아 닌context에 이미 존재하는 parrot주입해줌

        return p;
    }
}
