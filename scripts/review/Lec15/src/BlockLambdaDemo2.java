interface MyFunc2{
    String func(String s);
}

public class BlockLambdaDemo2 {

    public static void main(String[] args) {

        MyFunc2 fn = (str)->{   //str 로 넣으면 타입 상관없이 String으로 받음
            String res = "";
            for (int i = str.length() -1; i >=0  ; i--) {
                res+=str.charAt(i);
            }
            return res;
        };

        System.out.println(fn.func("helloworld!"));
    }
}
