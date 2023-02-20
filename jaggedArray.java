class jaggedArray {
    public static void main(String[] args) {

        int arr[][] = {{1,3,2,332,3,},
        {2134,234,423,23,123},
        {123,234,32423,24,4} //jagged array inside  array wiyh differ row and column

        };
       
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
System.out.println(arr.length);//length is number of column in row
System.out.println(arr[1].length);
    }
}
