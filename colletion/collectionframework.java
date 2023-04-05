import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.*;

import java.util.ListIterator;

class collectionframework{
    public static void main(String[] args) {
        
        set();
    }
    public static void set(){
      HashSet<Integer>hs=new HashSet<>();
           
       
        hs.add(23);
        hs.add(123);
        hs.add(223);
        hs.add(323);
      
    hs.forEach(e->{//java8 concept of lambda expression
        System.out.println(e);
    });
    System.out.println(hs);
        
    


    }
    public static void  itr(){
        ArrayList<Integer> al=new ArrayList<>();
    al.add(123);
    al.add(432);
    al.add(543423);
    al.add(4444123);
    al.add(4532);
    al.add(55543423);
   // Iterator<Integer> it=al.iterator();
    //while(it.hasNext()){
      // System.out.println(it.next());
  //  }
    ListIterator<Integer> itr2=al.listIterator(al.size()-3);
    while(itr2.hasPrevious()){
        System.out.println(itr2.hasPrevious());
        itr();
    }

    }
    public static int  collection(){
        ArrayList<Integer> al=new ArrayList<>();
        al.add(123);
        al.add(432);
        al.add(543423);
        al.add(4444123);
        al.add(4532);
        al.add(55543423);

        int greter=al.get(0);
        for(int i:al){//terversalin colletion with help for each loop
            if(i>greter){
                greter=i;
            }
         
        }
        return greter;
      
    }
    
  
}