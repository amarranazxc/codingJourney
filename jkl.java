import java.util.Scanner;

public class jkl { 
    public static void main(String[] args) {
    int []array={123,123,4,2345,654321,12,3456,76,54323,4567,6543};
    for(int i:array){
        System.out.println(i);
    }
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the possion to change the value");
    int pos=scan.nextInt();
    System.out.println("enter number");
    int temp=array[pos];
    
    array[pos]=scan.nextInt();
    for(int j:array){
        System.out.println(j);
    }
scan.close();;

}
    
}

