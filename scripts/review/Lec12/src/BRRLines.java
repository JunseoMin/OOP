import java.io.*;

public class BRRLines {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in , System.console().charset())); //open stream
        String str;

        System.out.println("enter stop to stop");
        do {
            str=bf.readLine();
            System.out.println();  // returns string! .read() ==> char
        }while (!str.equals("stop"));
    }
}
