public class reverse {
    public static void main(String[] args) {
        int arrr[]={1,2,3,4,5,6,7,8,9};
        reverse(arrr);
    }
    public static void reverse(int arr[]){
        for(int start=0, last=arr.length-1; start<last;start++,last-- ){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
        }
        for(int t:arr){
            System.out.print(t+" ");
        }
    }
    
}
