import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This is a &copy; copyright symbol " + "but this is &copy not.\n";
        byte[] buf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean mark = false;

        try(BufferedInputStream f = new BufferedInputStream(in)){
            while((c = f.read()) != -1){
                switch (c) {
                    case '&':
                        if (!mark) {
                            f.mark(32);
                            mark = true;
                        } else mark = false;
                        break;

                    case ' ':
                        if (mark) {
                            f.reset();
                            mark = false;
                            System.out.print('&');
                        } else System.out.print((char) c);
                        break;

                    default:
                        if (!mark) {
                            System.out.print((char) c);
                            break;
                        }

                }
            }
        }catch (IOException e){
            System.out.println("error input stream: "+e);
            return;
        }
    }
}
