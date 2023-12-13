package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // 스테레오 타입 어노테이션
public class Person {

  private String name = "Ella";

  @Autowired  //인스턴스 변수에 마킹하는 방법  -> parrot이라는 빈을 확인하고 넣어줌 IOC
  private Parrot parrot;  // 인스턴스 변수 방법을 이용할 경우 final로 선언할 수 없음

  @Autowired  // 생성자에 마킹하는 방법 => final변수로 인스턴스 변수 선언 가능! 주로 이 방법 사용됨
  public Person(Parrot parrot){
    this.parrot = parrot;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parrot getParrot() {
    return parrot;
  }

  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }
}
