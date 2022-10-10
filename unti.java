
public class unti{
    public static int suma=0;
    public static void main(String[] args) {
        printend(19);
        System.out.println();
System.out.println("factorial of number that you entered "+facotrial(2));  
System.out.println(sumofdigit(12));      
    }
    public static void  printend(int num){
        if(num==0){//this is base case of recursion
           return ;//print the number until the end of the one
        } 
          printend(num-1);
        System.out.print(num+" ");
      //recursive methode in java
    }
    public static int facotrial(int num){
        if(num==0){
            return 1;
        }
        return num*facotrial(num-1);
    }
    public static int sumofdigit(int num){
        if(num==0){
            return 0;
        }
        return (num%10)*sumofdigit(num/10);
    }
   
    
}