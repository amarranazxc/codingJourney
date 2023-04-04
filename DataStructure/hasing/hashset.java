import java.util.*;
public class hashset {
    public static void main(String[] args) {
       add(10);
       add(11);
       add(12);
       add(13);
       add(14);
     
       
       display(add(15));
     
    }
    static int []arr=new int[10];
    public static int [] add(int data){
       
       int  index=data%10;
       arr[index]=data;
        return arr;

    }
    public static void display(int []arrr){
        for(int i:arrr){
            System.out.println(i);
        }
    }
    
}
