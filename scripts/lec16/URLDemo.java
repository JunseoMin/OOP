import java.net.*; 
class URLDemo { 
  public static void main(String[] args) throws MalformedURLException { 
    URL hp = new URL("https://cs.kw.ac.kr:501/main/main.php"); 
 
    System.out.println("Protocol: " + hp.getProtocol()); 
    System.out.println("Port: " + hp.getPort()); 
    System.out.println("Host: " + hp.getHost()); 
    System.out.println("File: " + hp.getFile()); 
    System.out.println("Ext:" + hp.toExternalForm()); 
  } 
}

