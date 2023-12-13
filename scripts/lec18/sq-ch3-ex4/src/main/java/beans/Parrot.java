package beans;

import org.springframework.stereotype.Component;

@Component  //스테레오 타입 어노테이션
public class Parrot {

  private String name = "Koko";

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Parrot : " + name;
  }
}
