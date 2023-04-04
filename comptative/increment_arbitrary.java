
import java.util.ArrayList;
import java.util.List;

class increment_arbitrary {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        arr.add(9);
        increment(arr);
        System.out.println(arr);

    }

    public static void increment(List<Integer> arr) {
        int n = arr.size() - 1;
        arr.set(n, arr.get(n) + 1);
       for(int i=n;i>=0;i--){
           if(arr.get(i)==10){
               arr.set(i,0);
               arr.set(i-1,arr.get(i-1)+1);
           }
           if(arr.get(0)==10){
               arr.set(0,0);
               arr.add(0,1);
           }
       }
    }

}
