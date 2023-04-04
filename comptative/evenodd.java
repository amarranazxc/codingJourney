public class evenodd {
    public static void arrang(int arr[]){
        int start=0;
        int last=arr.length-1;
        while (start<last) {
            if(arr[start]%2==0){
                start++;
            }else{
                int temp=arr[start];
                arr[start]=arr[last];
                arr[last--]=temp;
            }
            
            }
        for(

    int p:arr)
    {
        System.out.println(p);
    }
    }
    public static void main(String[] args) {
        int []array={12,3clone,4,123,1};
        arrang(array);

    }
}
