public class additontwo { 
    public static void main(String[] args) {
        int [][] arr1=new int[3][3];
        int [][] arr2=new int[3][3];
        int count=0;
        int tr=0;
        int [][]sum=new int [3][3];
        System.out.println("------------------------------- addition");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){//addtion of two array 2d
                arr1[i][j]=count++;
                arr2[i][j]=tr++; 
            sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.print(sum[k][l]+"  ");
            }
            System.out.println();
            
        }
        System.out.println("------------------------------- multiplication");
        int pou=0;
        int tou=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){//multiplication of two array 2d
                arr1[i][j]=pou++;
                arr2[i][j]=tou++; 
            sum[i][j]=arr1[i][j]*arr2[i][j];
            }
        }
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                System.out.print(sum[k][l]+"   ");
            }
            System.out.println();
        }
    
}
    
}
