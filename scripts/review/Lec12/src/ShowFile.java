import java.io.*;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        if (args.length != 1){
            System.out.println("usage: ShowFile <filename>");
            return; // 인자가 없을경우 예외처리
        }

        try{
            ////////////////// open input streams
            // file input stream은 try catch 문 필요
            fin = new FileInputStream(args[0]); // open stream
        }catch (FileNotFoundException e){   // file not found exception
            System.out.println("cannot open file");
            return;
        }
        try {
            do {
                i = fin.read(); // fin.read의 return type 은 int! (get byte)
            }while (i!=-1);
        }catch (IOException e){
            System.out.println("read error");
        }
        try {
            fin.close();    // stream 은 닫아줘야함. final 키워드로 하는게 바람직함.
        }catch (IOException e){
            System.out.println("error closing file");
        }
    }
}
