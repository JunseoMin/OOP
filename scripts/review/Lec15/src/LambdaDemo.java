interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber Mynum;
        Mynum = ()  -> 1234.0;

        System.out.println(" "+Mynum.getValue());

    }

}

