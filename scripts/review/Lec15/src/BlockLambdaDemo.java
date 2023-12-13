interface NumericFunc{
    int fnc(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc nf = n -> {
            int res=1;  //구현 1
            for (int i = 1; i <= n; i++) {
                res = i*res;
            }//구현2
            return res;//구현3
        };  // 제네릭 선언 후에는 ; 해줘야함

        System.out.println(nf.fnc(10));

    }
}
