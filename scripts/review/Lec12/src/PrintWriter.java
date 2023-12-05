// 문자 스트림을 이용한 출력
public class PrintWriter {
    public static void main(String[] args) {
        java.io.PrintWriter pw = new java.io.PrintWriter(System.out, false); // auto flushing true! => 계행 문자가 나타나면 print!
        pw.println("pw string");
        pw.flush();
        pw.println(11);
    }
}