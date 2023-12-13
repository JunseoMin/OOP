package beans;  //beans라는 패키지 새로 생

public class Parrot {



  private String name;

  public Parrot(){
    System.out.println("created");  //인스턴스가 하나만 생성되는 것을 알 수 있음
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Parrot : " + name;
  } //오벌라이드 하여 정
}
