package Beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;

//    @Autowired
    private Parrot parrot;  // final 변수로 사용 불가

    @Autowired  // final 내부 인스턴스로 사용 가능
    public Person(Parrot p){
        this.parrot = p;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    //@Autowired  // setter에 마킹하는 방법 - final불가능, 가독성 떨어짐
    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    public java.lang.String getName() {
        return name;
    }

    public Parrot getParrot() {
        return parrot;
    }
}
