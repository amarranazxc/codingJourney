import java.util.HashMap;

public class romantointeger {
    public static int converter(String str){
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
         int sum=hm.get(str.charAt(str.length()-1));
         for(int i=str.length()-2;i>=0;--i){
             if(hm.get(str.charAt(i))>=hm.get(str.charAt(i+1))){
                 sum +=hm.get(str.charAt(i));

             }
            else
                 sum -=hm.get(str.charAt(i));

             
         }
         return sum ;


    }
    public static void main(String[] args) {
        System.out.println(converter("XII"));
    }
    
}
