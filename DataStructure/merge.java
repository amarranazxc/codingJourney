public class merge {
    public static void main(String[] args) {
        int arr[]={1,4,2,4,6,};
        int arrr[]={5,4,3,3,56,4};

        meregearray(arr, arrr);
        
    }
    public static int [] meregearray( int arr1[], int arr2[]){
        int arr3[]=new int [arr1.length+arr2.length];
        int j=0;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[i]){
                arr3[j]=arr1[i];
                j++;
            }
            else{
                arr3[j]=arr2[i];
                j++;
            }

        }
        return arr3;

    }
    
}
