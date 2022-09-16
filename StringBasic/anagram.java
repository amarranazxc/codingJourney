import java.io.*;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String A=scan.nextLine();
        String B=scan.nextLine();
        scan.close();
        A=A.toUpperCase();
        B=B.toUpperCase();
        char[]c=A.toCharArray();
        char[]d=B.toCharArray();
    sortArray(c,c.length()-1);
         
      
    }
    
}
