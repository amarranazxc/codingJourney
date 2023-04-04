import java.util.*;

public class arrangeoddeven {
    public static void main(String[] args) {
        int a[] = { 1, 45, 3, 23, 5, 654, 5, 44, 24, 3254, 64, 65 };
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            if (a[i] % 2 == 0) {// this is even and odd program to check
                i++;
            } else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j--;
 Scan            }

        }
        System.out.print("[");
        for (int k : a) {
            System.out.print(k + ",");
        }
        System.out.print("]");
    }

}
