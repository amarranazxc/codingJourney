import java.util.Scanner;

public class twodimensional {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value of rows");
        int row=scan.nextInt();
        System.out.println("enter the value of columns");
        int column=scan.nextInt();
        int [][]two=new int [row][column];
        for(int i=0;i<row;++i){
            for(int j=0;j<column;++j){
                two[i][j]=scan.nextInt();
            }
        }scan.close();
        for(int h=0;h<row;h++){
            for(int d=0;d<column;d++){
                System.out.print(two[h][d]+" ");
            } System.out.println();
        }
        
    }

    
}
