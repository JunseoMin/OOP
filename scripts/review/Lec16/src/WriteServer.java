import java.net.*;

public class WriteServer {
    public static int serverport = 1099;
    public static int clientport = 1098;
    public static int buffer_size = 1024;
    public static DatagramSocket ds;
    public static byte[] buf = new byte[buffer_size];

    // 소캣 - 말단 => 링크 해주기 위해 사용함
    // 패킷 - 데이터

    // 서버가 클라이언트한테 패킷을 보냄
    public static void TheServer() throws Exception {
        int pos = 0;
        while (true){
            int c = System.in.read();
            switch (c){
                case 'q':
                    System.out.println("Quit");
                    ds.close();
                    return;
                case '\r' :
                    break;
                case  '\n':
                    ds.send(new DatagramPacket(buf,pos,InetAddress.getByName("localhost"),clientport));
                    pos = 0;
                    break;
                default:
                    buf[pos++] = (byte) c;
            }
        }
    }

    public static void Client() throws Exception{
        while (true){
            DatagramPacket p = new DatagramPacket(buf,buf.length);
            ds.receive(p);
            System.out.println(new String(p.getData(),0,p.getLength()));
        }
    }


    public static void main(String[] args) throws Exception {
        if (args.length == 1) { //서버로 만드는 경우
            ds = new DatagramSocket(serverport);
            ds.setReuseAddress(true);
            TheServer();
        }
        else{
            ds = new DatagramSocket(clientport);
            ds.setReuseAddress(true);
            Client();
        }
        // 서버와 클라이언트는 동작중 충돌을 피하기 위해서 다른 포트 번호를 사용하여야 함.
    }
}
