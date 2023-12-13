import java.io.*;

public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        if (args.length != 1){
            System.out.println("usage ~~");
            return;
        }

        try (FileInputStream fin = new FileInputStream(args[0])){   // close 필요 없
            do {
                i = fin.read(); // casting 해서 받을경우 조건문이 항상 true 가됨
                if (i!=-1) System.out.print((char) i);  // 출력시에만 casting
            }while(i!=-1);
        }catch (FileNotFoundException e){
            System.out.println("file open err");
        }catch (IOException e){
            System.out.println("I/O error");    // IO Exception이 더 상위 class음
        }

    }
}
