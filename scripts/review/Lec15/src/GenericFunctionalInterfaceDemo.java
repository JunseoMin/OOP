interface SomeFunc<T>{  // 하나의 함수형 인터페이스 -> 입/출력 제네릭을 이용하여 여러번 사용 가능
    T func(T in);
}
public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> rev = (str)->{
          String res = "";
            for (int i = str.length() - 1; i >= 0 ; i--) {
                res += str.charAt(i);
            }
            return res;

        };

        System.out.println(rev.func("hello!"));

        SomeFunc<Integer> fac = (n)->{
            int r = 1;
            for (int i = 1; i < n+1 ; i++) {
                r *= i;
            }
            return r;
        };

        System.out.println(fac.func(10));
    }
}
