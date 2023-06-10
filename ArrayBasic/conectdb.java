import java.sql.*;
class conectdb{
    public static void main(String[] args) {
        
    
    String url="jdbc:mysql://localhost:3306/";
    String user="sadiyakhan";
    String pass="sadiyakhan";

   try {


       Connection conn=DriverManager.getConnection(url, user, pass);
      
       
   } catch (Exception e) {
      System.out.println(e);
   } 
}
    
  

}