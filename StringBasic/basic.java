public class basic  {
    public static void main(String[] args) {
        String a="Amar";
        String b="Rana";
        String c=a.concat(" rana");
        System.out.println(a.charAt(0)) ;//this use to find the char the location on string
        System.out.println(a.contains("d"));//this use to check substring is or not,boolean value
        System.out.println(a.indexOf("d"));//this we show the index of d in string
        System.out.println(a.substring(2));//use get substring
        System.out.println(a.trim());//it cut the space of string from start and end
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.codePointAt(2));
      
        System.out.println(Character.isDigit(3));//this charecter is class of java lang package in is;
        System.out.println(c);
        
    }
    
}
