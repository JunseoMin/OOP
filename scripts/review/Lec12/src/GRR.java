import java.io.*;

class GRR{
    public static void main(String[] args) throws IOException {
        char c;

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, System.console().charset())); // charset provide incodings of os

        System.out.println("Enter characters, 'q' to quit");
        do {
            c = (char)bufferedReader.read();    // type casting 
        } while (c != 'q');
    }
}