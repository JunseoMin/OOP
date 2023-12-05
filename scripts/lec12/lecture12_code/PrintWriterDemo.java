import java.io.*;

public class PrintWriterDemo {
  public static void main(String[] args) {
    PrintWriter pw = new PrintWriter(System.out, true);

    pw.print("This is a string");
    int i = -7;
    pw.print(i);
    double d = 4.5e-7;
    pw.print(d);
    // pw.flush();
  }
}

