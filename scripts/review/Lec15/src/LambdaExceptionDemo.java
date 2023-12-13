interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;

}
class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("array empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException{
        double[] da = {1.0,2.0,3.0,4.0,5.0};

        DoubleNumericArrayFunc dnfa = (n) -> {
            double sum = 0.0;
            if(n.length == 0){
                throw new EmptyArrayException();  // 예외 처리시 new 키워드 사용 예외처리 == 예외 생성
            }
            for (int i = 0; i <n.length ; i++) {
                sum+=n[i];
            }
            return sum/n.length;
        };

        System.out.println(dnfa.func(da));
        System.out.println(dnfa.func(new double[0]));
    }
}
