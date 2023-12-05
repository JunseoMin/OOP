import java.net.*;
import java.io.*;
import java.util.Date;

class UCDemo {
  public static void main(String[] args) throws Exception {
    int c;
    URL hp = new URL("http://www.google.com");
    URLConnection hpCon = hp.openConnection();

    System.out.println("Date: " + new Date(hpCon.getDate()));
    System.out.println("Content-Type: " + hpCon.getContentType());
    System.out.println("Expires: " + new Date(hpCon.getExpiration()));
    System.out.println("Last-Modified: " + new Date(hpCon.getLastModified()));
    long len = hpCon.getContentLengthLong();
    System.out.println("Content-Length: " + len);

    
    if(len != 0) {
      System.out.println("=== Content ===");
      InputStream input = hpCon.getInputStream();

      while (((c = input.read()) != -1)) {
        System.out.print((char) c);
      }
      input.close();

    } else {
      System.out.println("No content available.");
    }
    

  }
}

