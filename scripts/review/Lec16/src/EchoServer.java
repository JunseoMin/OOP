import java.net.*;
import java.io.*;

public class EchoServer {
    public static void main(String[] args) {
        ServerSocket server = new ServerSocket(11);
        server.setReuseAddress(true);

        Socket connection = server.accept();    // accept가 되면 클라이언트 소켓 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); // 래핑 진행됨 inputStream -n byte를 Reader - int 로 래핑하여 char로 타입 캐스팅

        String msg = null;

        while ((msg = in.readLine())!= null){   //readLine은 계행 문자는 제외함, 끝에 도달하면 null 출력
            if (msg.contains("end")) {
                break;
                System.out.println("Received: " + msg);
            }
            in.close();
            connection.close();
            server.close();
        }

    }
}
