import java.net.*;
import java.io.*;

class client {
    public static void main(String[] args) {
        try {
            System.out.println("client ready to conect");
            Socket s = new Socket("localhost", 5000);

            DataOutputStream jkl = new DataOutputStream(s.getOutputStream());
            DataInputStream zxc=new DataInputStream(s.getInputStream());
            jkl.writeUTF("amar");
           String str=(String) zxc.readUTF();
           System.out.println(str);
            jkl.flush();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}