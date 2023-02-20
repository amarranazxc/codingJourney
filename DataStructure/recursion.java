public class recursion {
    public static void amar(int a){
        if(a>0){
        System.out.println("amar rana");
        amar(a-1);//when a methode call itself then this kind of functionlity is recursion
        }//recursion make ainfinity loop that can be end with the help of any
        // condition otherwise the loop will not end 
    }
   public static void main(String[] args) {
       amar(3);
       
        
    }
    
}
