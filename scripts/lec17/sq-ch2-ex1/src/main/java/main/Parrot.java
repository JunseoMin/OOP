package main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }   //getter

    public void setName(String name) {
        this.name = name;
    } // setter
    // beans 메소드에는 getter와 setter 가 존재해야
}
