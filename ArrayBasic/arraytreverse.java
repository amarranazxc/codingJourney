class arraytreverse {
    static int[] arr = { 5, 4, 3, 5, 6, 4, 3, 2, 3, 4, 5, };

    public static boolean mai() {
        for (int i = 0; i <= arr.length; ++i) {
            if (arr[i] == 3) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(mai());
    }
}