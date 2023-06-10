import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class lists {
    public static void main(String[] args) {
        List<String> friends=List.of("amar","ankit","yogesh"); 
       for(String s:friends){
        System.out.println(s);
       }
       java.util.Iterator<String> itr=friends.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
    }
    
}
