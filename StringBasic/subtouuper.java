import java.io.*;
import java.util.*;

public class subtouuper {

    public static void main(String[] args) {

        Scanner xcv = new Scanner(System.in);
        String A = xcv.nextLine();

        String B = xcv.nextLine();
        xcv.close();
        System.out.println(A.length() + B.length());
        if (A.compareTo(B)<=0) {
            System.out.println("no");

        } else {
            System.out.println("yes");

        }
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase()
                + B.substring(1));
    }
}
