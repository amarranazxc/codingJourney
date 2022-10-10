public class checkarray {
   
    public static void main(String[] args) {
    
        int []arrr={1,2,3,4,5,6,7,8,9,};
       System.out.println(checkwithrecursion(arrr, 0));
       System.out.println(find(arrr, 123 ));
       System.out.println(findwithrecursion(arrr,3,0));
    }
    public static boolean checkAssendingOrder(int []arry){
        for(int i=0;i<arry.length-1;i++){
            if(arry[i]>arry[i+1]){
                return false;}
        }
        return true;
    }
    public static boolean checkDessendingOrder(int []arry){
        for(int i=0;i<arry.length-1;i++){
            if(arry[i]<arry[i+1]){
                return false;}
        }
        return true;
    } public static boolean checkwithrecursion(int []arry,int index){
        if(index==arry.length-1){
            return true;//check the arry is sorted in with recursion 
        }
        return (arry[index]>arry[index+1])&& checkwithrecursion(arry,index+1);
    }           //if will be fall in this conditon this will autyomatically genrate false because it is 
                 //conditional statemaent that also return the 
        
    
    
   public static boolean find(int []arry,int target){
       for(int i:arry){
           if(i==target){
               System.out.println("data is avaiable in array at index "+i );
               return true;
           }
       }
       System.out.println("data i9s not avaiable in arry");
       return false;
    }
    public static boolean findwithrecursion(int []arry,int target,int index){
    if(index==arry.length-1){
        return false;
    }
    return (arry[index]==target)|| findwithrecursion(arry,target,index+1);
    }
}
