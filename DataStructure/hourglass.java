import java.util.Scanner;

class hourglass{
    public static void main(String[] args) {
       
        hour();
    }
    public static int hour(){
        int arr[][]=new int[6][6];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<6;i++){
            for(int j=0;j<6;j++){
         arr[i][j]=scan.nextInt();
            }

        }scan.close();
        int sum=Integer.MIN_VALUE;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
               int newsum=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+2]+arr[i+3][j+1]+arr[i+3][j+2]+arr[i+3][i+3];
               if(sum<newsum){
                   sum=newsum;
               }
            }
        }
        return sum;

    }
}