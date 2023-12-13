import java.net.*;
import java.io.*;
public class Whois {
    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("whois.internic.net",43); //43번 whois 포트로 접
        InputStream in = s.getInputStream();    // 쿼리를 출력해줌
        OutputStream out = s.getOutputStream();
        String str = (args.length == 0 ? "google.com" : args[0]) + "\n";
        byte[] buf = str.getBytes();
        out.write(buf);

        while((c = in.read()) != -1){   // InputStream은 char의 int 값 반환
            System.out.print((char) c);
        }
        s.close();  //스트림 사용후 스트림 닫아줌
    }
}
