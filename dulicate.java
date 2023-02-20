public class dulicate {
    public static void main(String[] args) {
        int arra[]={1,1,1,1,1,2,2,2,3};
        
        dup (arra);
    }
    public static void dup(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=0;
                }

            }
        }
        for(int r=0;r<arr.length-1;r++){
            int small=0;
            if(arr[r]!=0){
               if( arr[small]==arr[r]){
                   continue;

               }
               else{
                   int temp=arr[small];
                   arr[small]=arr[r];
                   arr[r]=0;
               }
               
                small++;

            }

        }
        for(int t:arr){
        System.out.println(t);}
    }
    
}
