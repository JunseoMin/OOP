package config;
// bean 을 context에 추가
import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration  //bean추가
public class ProjectConfig {

  @Bean
  public Parrot parrot() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }
  //direct wiring
  @Bean
  public Person person() {
    Person p = new Person();
    p.setParrot(parrot());  // bean을 직접적으로 묶어줌 -> 소유관계 설정 력
    p.setName("Ella");
    return p;
  }
}
