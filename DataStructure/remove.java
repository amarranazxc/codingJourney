class remove{
    public static void main(String[] args) {
        int []sd={23,5,4,3,2,3,4};
        removeodd(sd);
        
        
    }
    public static int[] removeodd(int[]arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
               count++;
            }
        }
        int []result=new int[count];
        int  idx=0;
        for(int a=0;a<arr.length;a++){
            if(arr[a]%2==0){
            result[idx]=arr[a];}
            idx++;

        }
        
        return result;

    }
}