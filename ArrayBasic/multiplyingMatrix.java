public class multiplyingMatrix {
    public static void main(String[] args) {
        int [][] arr1={
            {1,4,0},
            {0,2,0},
            {0,0,1}
        };
        int [][] arr2={
            {1,4,0},
            {0,1,0},
            {0,0,1}
        };
        int arr3[] []=new int [arr1.length][arr1.length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
                arr3[i][j]=arr1[i][j]*arr2[i][j];

            }


        }
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1.length;j++){
              System.out.print(arr3[i][j]+" ");
            }System.out.println();


        }
       

        
      
        
    }
    
}
