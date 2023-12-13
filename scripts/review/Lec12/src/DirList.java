import java.io.*;

public class DirList {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);

        if (f1.isDirectory()){
            System.out.println(dirname+" is directory");
            String[] s = f1.list(); // list 의 return type 은 String

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "/" + s[i] );
                if (f.isDirectory()){
                    System.out.println(s[i] + "is directory");
                }
                else System.out.println(s[i] + " is file");
            }
        }
        else System.out.println(dirname + "is not a directory");
    }
}
