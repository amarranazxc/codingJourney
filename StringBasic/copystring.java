class copystring {
    public static void main(String[] args) {
        System.err.println(zx());
       
    }
    public static String zx(){
        String a = "AMARRANA";
        StringBuilder s = new StringBuilder();
        for (int i = 0; i <= a.length(); ++i) {
            s.append(a.charAt(i));
           
        } 
        return s.toString();
    } 
}