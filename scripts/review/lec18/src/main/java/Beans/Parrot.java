package Beans;


import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private String name;

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    @Override
    public String toString(){

        return "Parrot: "+name;
    }

}
