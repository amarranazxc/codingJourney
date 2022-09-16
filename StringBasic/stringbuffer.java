package string;
class stringbuffer{
    public static void main(String[] args) {
        StringBuffer xcv=new StringBuffer("qwerty");
        xcv.append("asdfg");
        xcv.insert(2,"qwerty");
       
        System.out.println(xcv+" "+xcv.length() );
        String jk="amar";
        System.out.println(jk.substring(0,2)+"rana"+jk.substring(2));
        
    }
}//mainly these are both same but but main diffren between is we can mainpulate the easily
//append for add string at the end 
//inset the particular positionof srting
