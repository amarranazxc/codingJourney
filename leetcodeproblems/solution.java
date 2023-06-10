import java.util.Scanner;

class solution{
    public static String plindrome(String str){
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)==str.charAt(j)){
                continue;
            }
            else{
                return "No";
            }
            
        }
        return "yes";
    }
    public static void main(String [] args ){
        Scanner  scan =new Scanner(System.in);
        String  str=scan.nextLine();
System.out.println(plindrome(str));
scan.close();      
    }
}