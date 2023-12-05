import java.io.*; 
 
class ByteArrayOutputStreamDemo { 
  public static void main(String[] args) { 
    ByteArrayOutputStream f = new ByteArrayOutputStream(); 
    String s = "This should end up in the array"; 
    byte[] buf = s.getBytes(); 
 
    try { 
      f.write(buf); 
    } catch(IOException e) { 
      System.out.println("Error Writing to Buffer"); 
      return; 
    }

    System.out.println(f.toString());
  }
}