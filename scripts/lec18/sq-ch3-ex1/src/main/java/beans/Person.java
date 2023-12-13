package beans;

public class Person {

  private String name;
  private Parrot parrot;  // person object에 parrot 의 객체 주가하여 has - a 관계 구성

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
