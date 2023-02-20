import java.util.ArrayList;
import java.util.List;

public class multi {
    public static void  main(String[] args) {
        List<Integer>list1=new ArrayList<>();
        List<Integer>list2=new ArrayList<>();
        list1.add(2);
        list1.add(2);
        list2.add(2);
        list2.add(1);
mul(list1, list2);      
        

    }
    public static void   mul(List<Integer>list1,List<Integer>list2){
        int number1=0;
        int number2=0;
        int po1=0;
        int po2=0;

        for(int i=list1.size()-1;i>=0;i--){
            number1 +=list1.get(i)*Math.pow(10,po1);
            po1++;
        }
        for(int i=list2.size()-1;i>=0;i--){
            number2 +=list2.get(i)*Math.pow(10,po2);
            po2++;
        }
        double multiresult=number1*number2;
        List<Integer>list3=new ArrayList<>();
     while(multiresult!=0){
         int ind=(int) (multiresult%10);
        
list3.add(ind);
 int c=(int) (multiresult/10);


     }
     for(int i=list3.size();i>=0;i--){
         System.out.println(i);
     }
    }
    
}
