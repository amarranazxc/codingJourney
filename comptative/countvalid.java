import java.util.ArrayList;
import java.util.List;

public class countvalid {
    public static void main(String[] args) {
        List<Integer> zxc = new ArrayList<>();
        zxc.add(1);
        zxc.add(1);
        zxc.add(1);
        zxc.add(2);
        zxc.add(2);
        zxc.add(2);
        System.out.println(deleteDuplicates(zxc));

    }

    public static List<Integer> deleteDuplicates(List<Integer> A) {
        if (A.isEmpty()) {
            return null;
        }
        int writelndex = 1;
        for (int i = 1; i < A.size(); ++i) {
            if (!A.get(writelndex - 1).equals(A.get(i))) {
                A.set(writelndex++, A.get(i));
              
            }
        }
       
        return A;

    }

}
