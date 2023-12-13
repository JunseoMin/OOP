import java.net.*;
/*
IP 주소를 얻어보는 과정 구현
팩토리 메서드를 이용하여 InetAddress 객체를 받아옴
 */

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException{
        InetAddress Address = InetAddress.getLocalHost();   // get localhost address 127.0.0.1, 팩토리 메서드
        System.out.println(Address);

        Address = InetAddress.getByName("www.google.com");  // google ip address by Domain name
        System.out.println(Address);

        InetAddress[] SW = InetAddress.getAllByName("www.naver.com");   // get all address
        for (int i = 0; i < SW.length; i++) {
            System.out.print(SW[i]);
        }
    }
}
