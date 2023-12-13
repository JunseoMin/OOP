import java.io.*;
// 바이트 배열을 입력 스트림으로 처리
public class BinaryArrayInoutStreamReset {
    public static void main(String[] args) {
        String tmp = "abc";
        byte[] b = tmp.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(b);

        for (int i = 0; i < 2; i++) {
            int c;

            while ((c = in.read()) != -1){  // byte stream 끝까지 읽음
                if (i == 0) {
                    System.out.print((char) c); // type casting
                }
                else {
                    System.out.print(Character.toUpperCase((char) c)); // type casting
                }
            }

            System.out.println();
            in.reset(); // 버퍼 리셋 0부터 다시읽음
        }
    }
}
