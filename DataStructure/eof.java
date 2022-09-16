import java.util.Scanner;

public class eof{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i=1;
        while(scan.hasNextDouble()){//.has scanner methode is use to scan a variable until we enter the the vaues
            
        System.out.println(i+" eneter a number");
        int number=scan.nextInt();
        i++;
        }scan.close();

    }

}
