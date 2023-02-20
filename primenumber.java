import java.util.ArrayList;
import java.util.List;

public class primenumber {
    public static void main(String[] args) {
       
        System.out.println(prime(34));
    }
    public static List <Integer> prime(int number){
        List <Integer> list=new ArrayList<>();
        list.add(2);
        for(int i=1;list.get(i)<number;i++){
            list.add(2);
        }
        return list;
    }
    
}
