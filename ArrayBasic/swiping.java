public class swiping {
    public static void main(String[] args) {
        int []arr={3,2,3,5,4,};
        int temp;
        for(int i=0;i<arr.length;++i){
            temp=arr[i];
            arr[i]=arr[i++];
            arr[i++]=temp;
        }
        for(int h=0;h<arr.length;h++){
            System.out.println(arr[h]);
        }
    }
    
}
