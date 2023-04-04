class charcjeck{
    public static void main(String[] args) {
        revese("my name is amar");
    }
    public static void revese(String as){
        String [] arr=as.split(" ");
        for(String r:arr){
            System.out.print(r +" ");
        }
        for( int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]+" ");
        }
    }
}