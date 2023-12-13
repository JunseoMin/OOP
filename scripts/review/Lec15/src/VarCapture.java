public class VarCapture {
    public static void main(String[] args) {
        int num =10;

        MyFunc3<Integer> fnc1 = (n)->{
            int v = num+n;
            //num++; // 람다 표현식 밖의 변수 참조 final이어서 수정 불가능함(compile error!)
            return v;
        };

        System.out.println(fnc1.fnc(10));

    }
}
