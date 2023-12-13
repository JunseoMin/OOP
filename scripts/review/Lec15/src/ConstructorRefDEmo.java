interface Refinterface{
    MyClass00 refunc(int n);
}

class MyClass00{
    private int val;

    MyClass00(int v) {val = v;}
    MyClass00() {val = 0;}

    int getVal(){
        return val;
    }
}

public class ConstructorRefDEmo {
    public static void main(String[] args) {

        Refinterface classCons = MyClass00::new;    // 생성자 참조   제네릭 생성자의 경우 Myclass<T>::new 이런식으로 해야
        MyClass00 mc = classCons.refunc(10);    // 객체 생성

        System.out.println(mc.getVal());
    }
}
