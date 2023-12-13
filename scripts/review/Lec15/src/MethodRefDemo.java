class StrOP2{
    static String strRev(String str){
        String res = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}

public class MethodRefDemo {
    static String stringOP2(MyFunc3<String> sf, String s){
        return sf.fnc(s);
    }

    public static void main(String[] args) {
        String instr = "LAMDA AS as AS";
        String outstr;

        outstr = stringOP2(StrOP2::strRev, instr);
        System.out.println(outstr);
    }
}
