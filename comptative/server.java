import java.net.*;
import java.io.*;

class server{
    public static void main(String[] args) {
        try {
            System.out.println("server waiting for conection");
            ServerSocket sc=new ServerSocket(5000);
            Socket s=sc.accept();
            System.out.println("conection establish");
            DataInputStream asd=new DataInputStream(s.getInputStream());
            DataOutputStream zxc=new DataOutputStream(s.getOutputStream());
            asd.readUTF();
            zxc.writeUTF("am server");
       
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}