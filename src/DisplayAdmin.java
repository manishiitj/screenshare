  import java.net.*;
  class DisplayAdmin
 {
 public static void main(String arg[]) throws Exception {
 Socket s = new Socket("10.4.3.214", 2203);
 s.getOutputStream().write('X');
 s.close();
 }
 }