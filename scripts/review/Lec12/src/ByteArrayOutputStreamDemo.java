import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
       ByteArrayOutputStream f = new ByteArrayOutputStream();

       String s = "this should end up in the array";

       byte[] buf = s.getBytes();

       try{
            f.write(buf);
       } catch (IOException e){
           System.out.println("error writing buffer");
           return;
       }
        System.out.println(f.toString());

    }
}
