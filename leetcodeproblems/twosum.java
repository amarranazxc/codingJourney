public class twosum {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,3,2,};
     
        for(int i:sum(arr, 40)){
            System.out.println(i);
        }
    }
public static int [] sum(int[]array,int target){
    
    for(int i=0;i<array.length;i++){
        for(int j=i+1;j<array.length;j++){
            if(array[i]+array[j]==target){
                int []arrr=new int [2];
                arrr[0]=i;
                arrr[1]=j;
                return arrr;
            }
        }
    }
    return null;

}

    
}
