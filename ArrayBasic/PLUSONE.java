       /*WAP APROGRAM THAT TAKE ARRAY IN INPUT TNEN COVERT IN DECIMAL
        CONERT A ARRAY AS {1,2,9}IS   D 129 OUTPUT SHOULD BE {130}
        */









import java.util.ArrayList;                                
import java.util.List;

class PLUSONE {
    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(9);
        System.out.println(plusOne(A));
    }

    public static List<Integer> plusOne(List<Integer> A) {
        int n = A.size() - 1;
        A.set(n, A.get(n) + 1);
        for (int i = n; i > 0 && A.get(i) == 10; --i) {
            A.set(i, 0);
            A.set(i - 1, A.get(i - 1) + 1);
          
        }
        return A;
    }
}