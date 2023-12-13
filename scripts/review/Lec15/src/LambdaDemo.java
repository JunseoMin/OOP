interface MyNumber{ //함수형 인터페이스 - 람다 표현식의 입출력을 조절함
    double getValue();  //입력 - void, 출력 - double
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber Mynum;
        Mynum = ()  -> 1234.0;
        System.out.println(" "+Mynum.getValue());
    }
}