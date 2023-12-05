/**
 * scope
 */
public class Type {

    public static void main(String[] args) {
        byte a=12;
        short b=123;
        int c=12345;
        long d=123456789;
        char e='A';
        float f=(float)12.34;
        double g=123.456;
        boolean h=false;
        // 각각을 12, 123, 12345, 123456789, 'A', 12.34, 123.456, false 의 값으로 초기화
        System.out.println(
            "byte: "+a+"\n"+
            "short: "+b+"\n"+
            "int: "+c+"\n"+
            "long: "+d+"\n"+
            "char: "+e+"\n"+
            "float: "+f+"\n"+            
            "double: "+g+"\n"+
            "boolean: "+h+"\n"
        );
    }
}