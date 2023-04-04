import javax.print.attribute.standard.MediaName;

public class advancin  {
    public static void main(String[] args) {
        int arra[]={1,1,1,1,1,1,1};
        advanc(arra);
        
    }
    public static void  advanc(int []array){
        int i=0;
        int count=0;
        while(i<array.length){
            if(i>array.length){
                count++;
              break;
            }
            if(array[i]!=0){
                i=array[i];
                count++;
            }
            if(array[i]==0){
                count++;
                i++;
            }
           
        }
        System.out.println(count);
    }
    
}
