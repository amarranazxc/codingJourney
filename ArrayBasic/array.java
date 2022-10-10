import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        take(2);
       System.out.println("   ");
        int s[]={1,2,3,2,1,3,4,3,2};
        sort(s);
         for(int p=0;p<=s.length;++p){//this will generate the exception of arrayindexoutofboundexception
            System.out.println(s[p]);//this will disturbe the flow controle of programwe can 
            //over come this by using try catch block of exception handling
            //this generate this because it traverse to array to length but its indexes is start with 0
        }
       
        passingarray(s);//passing arrayto methode
        anonymous(new int[]{1,32,2,1,2,3,2,22,});//passing anonmuos arry to methode
       int []a= ret();
       for(int i:a){//foreach loop statement in java that treverse the array 
           System.out.print(i+",");
          
       }
      
    }
    public static void passingarray(int[]arr){
        for(int i:arr){
        System.out.print(i+",");
        }
    }
    public static void anonymous(int[]as){
        for(int i:as){
            System.out.println(i+",");
            }

    }
    public static int[] ret(){//array retruning methode 
        return new int[]{3,2,5,4,32,3324,};
            
    }
    public static void take( int Size){//taking of input as array
        Scanner scan =new Scanner(System.in);       
        int [] zxc=new int[Size];
        for(int v=0;v<=Size-1;v++){
            System.out.println("enter the vaue"+v); 
            zxc[v]=scan.nextInt();
        }
     for(int g=0;g<zxc.length-1;++g){
            System.out.print(zxc[g]+" ");
        }

    }
    public static int length() {
        return 0;
    }
}