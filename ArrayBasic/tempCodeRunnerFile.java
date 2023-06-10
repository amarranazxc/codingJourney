public class mergearray {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 4, 5, 7, 9 };
        int arr2[] = { 2, 6, 8 };
        System.out.println(mid(arr1, arr2));
    }

    public static int mid(int[] arr1, int[] arr2) {
        int[] arr3 = merge(arr1, arr2);
        int size = arr3.length;
        if (size % 2 != 0) {
            return arr3[size / 2 + 1];
        }
        return -1;
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int arr3 = arr1.length + arr2.length;
        int arr4[] = new int[arr3];
        int i = 0;
        int j = 0;
        int k = 0;
        while (j != arr1.length-1 || k != arr2.length-1||i<=arr4.length) {
            if (arr1[j] > arr2[k]) {
                arr4[i] = arr1[j];
                i++;
                j++;
            }
            if (arr1[j] < arr2[k]) {
                arr4[i] = arr1[k];
                i++;
                k++;
            }

        }
        return arr4;
    }

}
