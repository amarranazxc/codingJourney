public class arraytointegerconversion {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int number=0;
        int power=0;
        for(int i=arr.length-1;i>=0;i--){
            number +=arr[i]*Math.pow(10, power);
            power++;

        }
        System.out.println(number);
    }
    
}
