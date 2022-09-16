import java.io.*;
import java.util.*;
public class anagram {
    public static void main(String[] args) {
        String A="ACT";
        String B="CAT";
        int acode=0;
        int bcode=0;
        for(int i=0;i<=A.length()-1;++i ){
            acode+=A.codePointAt(i);}
            for(int j=0;j<=B.length()-1;++j){
            bcode+=B.codePointAt(j);
        }
        if(acode==bcode){
            System.out.println("Anagrams");

        }
        if(acode!=bcode){
              System.out.println("Not Anagrams");
        }

        
    }
    
}
