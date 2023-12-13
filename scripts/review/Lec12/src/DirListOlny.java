import java.io.*;
class OlnyExt implements FilenameFilter{
    String Ext;

    public OlnyExt(String Ext){
        this.Ext = "." + Ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(Ext);
    }
}


public class DirListOlny {
    public static void main(String[] args) {
        String dirname = "/java";
        File f1 = new File(dirname);    // stream이 아니어서 close 없

        FilenameFilter olny = new OlnyExt("html");  //interface이용하여 선언

        String[] s = f1.list(olny);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

    }
}
