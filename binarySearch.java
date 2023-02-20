public class binarySearch {
    public static void main(String[] args) {
        int[] arre = { 123, 45, 876, 345, 76, 234, };

        System.out.println(searchfast(arre, 45));

    }

    public static int  searchfast(int arr[],int target){
        if(target>arr[arr.length/2]){
            for(int i=arr.length/2;i<arr.length;i++){
                if(target==arr[i]){
                   return i;
                } 
            }
        }    
         
         else{
               for(int i=0;i<arr.length/2;i++){
               if(target==arr[i]){
              return i;}
           }  
        
        }
        return 0;

    }

}
