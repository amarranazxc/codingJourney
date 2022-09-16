//Java Program to illustrate the jagged array  
public class TestJaggedArray{  
    public static void main(String[] args){  
        //declaring a 2D array with odd columns  
        int arr[][] = new int[3][];  
        arr[0] = new int[3];  
        arr[1] = new int[4];  
        arr[2] = new int[2];  
        //initializing a jagged array  
        int count = 0;  
        for (int i=0; i<arr.length; i++)  //here arr.length is 3
            for(int j=0; j<arr[i].length; j++)  //here arr[0].length is 3,forarr[1] is 4
                arr[i][j] = count++;  
   
        //printing the data of a jagged array   
        for (int i=0; i<arr.length; i++){  
            for (int j=0; j<arr[i].length; j++){  
                System.out.print(arr[i][j]+" ");  
            }  
            System.out.println();//new line  
        }  
        System.out.println(arr.length);
    }  
}  //jagged Array whoch have rows and diffrent  coumns number  for every row of Array