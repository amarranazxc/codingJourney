import java.util.ArrayList;
import java.util.List;

public class maximam {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(2);
        list.add(12);
        list.add(23);
        list.add(42);
        list.add(25);
        System.out.println(max(list));
        
    }
    public static int max(List<Integer>A){
        int max=0;
        for(int i:A){
            max=Math.max(max,i);
            
        }
        return max;
    }
}
