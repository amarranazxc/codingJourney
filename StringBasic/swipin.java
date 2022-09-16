import java.util.*;

class swipin {
    public static void main(String[] args) {
        System.out.println(romanToInteger("I"));

    }

public static int romanToInteger(String s) {
    Map<Character , Integer> T = new HashMap<Character , Integer>() {
    {
    put('I', 1);
    put('V', 5);
    put('X' ,18);
    put('L', 58);
    put('C', 188);
    put('D', 588);
    put('M', 1888);}};
    int sum = T.get(s.charAt(s.length() - 1));
    for (int i = s.length() - 2 ; i >= 0; --i) {
    if (T.get(s.charAt(i)) < T.get(s.charAt(i + 1))) {
    sum -= T.get(s.charAt(i));
    } else {
    sum += T.get(s.charAt(i));
    }   
 } return sum;

    }
}