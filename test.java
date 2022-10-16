public class test {
    public static void main(String[] args) {
        printstar(9, 0);
        
    }
    public static void  printstar(int row,int coloumn){
        if(row==0){
            return;
        }
        if(row>coloumn){
            System.out.print(" @");
            printstar(row, coloumn+1);
        }
       else{
           System.out.println();
           printstar(row-1, 0);
          
       }
    }
}
