interface MyFunc3<T>{
    T fnc(T in);
}

public class LambdaAsArgumentDemo {
    static String stringOP(MyFunc3<String> sf, String s){   //함수의 인자로 인터페이스 전달 -> 람다 표현식을 인자로 사용 가능!
        return sf.fnc(s);
    }

    public static void main(String[] args) {
        String instr = "lambda as argument DEMO";
        String outstr;

        System.out.println("input: " + instr);
        outstr = stringOP((str)-> str.toUpperCase(),instr);
        System.out.println("output: " + outstr);
        outstr = stringOP((str)->{
            String res="";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    res+=str.charAt(i);
                }
            }
            return res;
        },instr);

        System.out.println("input: " + instr);
        System.out.println("output: "+ outstr);
    }
}
