public class palindromic {
    static String c = "asdfghgfdsaASDFG";

    public static void main(String[] args) {

        System.out.println(plin("amar"));
        System.out.println(reverseIt("amar"));
        System.out.println(indexofchar('A'));
       
     

    }

    public static  void plin(String a) {
        boolean valid=true;
        for (int i = 0, j = a.length() - 1; i < j; i++, j--) {
            if (a.charAt(i) != a.charAt(j)) {
               System.out.println(valid);
            }
        }
        return true;
    }

    public static String reverseIt(String b) {
        String w = "";//this is for create the string
        for (int i = b.length() - 1; i >= 0; --i) {
            w += b.charAt(i);//by using conca
        }
        return w;

    }

    public static int indexofchar(char d){
        for (int i=0;i<=c.length()-1;++i){
            if(c.charAt(i)==d)
                return i;
            }
        return -1;
    }

  
}

