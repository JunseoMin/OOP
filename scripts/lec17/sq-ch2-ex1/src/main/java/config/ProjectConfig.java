package config;
// IOC를 구성하기 위해 config를 이용하여 context에 객체를 추가해줘야 함

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 어노테이션을 이용해 config를 알려줌 마커 어노테이션 스프링 프레임워크에게 알려줌
@ComponentScan(basePackages = "main")   // component scan을 이용하여 해당 패키지에 존재하는 beans를 추가해줌 스테레오 타입 어노테이
public class ProjectConfig {

//    @Bean   // bean이라는 것을 spring context에 알려줌 -> context에 추가함
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("KoKo");
//        return p;   // object를 리턴해줌
//    }

    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }

//    @Bean
//    Parrot parrot1(){
//        var p = new Parrot();
//        p.setName("KiKi");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot2(){
//        var p = new Parrot();
//        p.setName("KAKA");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot3(){
//        var p = new Parrot();
//        p.setName("KOKU");
//        return p;
//    }
}
