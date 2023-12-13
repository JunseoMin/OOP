import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null; // null 로 선언해야 예외처리 가능함
        FileOutputStream fout = null;

        if (args.length != 2){  // null로 받으면 안됨
            System.out.println("usage: CopyFile <filename1> <filename2>");
            return; // 예외처리
        }
        try {
            fin = new FileInputStream(args[0]); // open stream
            fout = new FileOutputStream(args [1]);  // open stream
            do {
                i=fin.read();
                if (i!=1){
                    fout.write(i);  // type casting 필요 없음
                }
            }while(i!=-1);
        }catch (IOException e){
            System.out.println("err: "+ e);
        }
        finally {
            try {
                if (fin!=null){
                    fin.close();
                }
            }
            catch (IOException e2){
                System.out.println("error closing input file");
            }
            try {
                if (fout!=null){
                    fout.close();
                }
            }catch (IOException e2){
                System.out.println("error closing file output file");
            }
        }
    }
}
