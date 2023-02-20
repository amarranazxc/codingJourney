public class split {
    public static void main(String[] args) {
    reve("my nme is amatr");
    }
    public static void reve(String str){
        String word="";
        String []arry=new String[4];
        int j=-1;
        for(int i=0;i<str.length();i++){
            word=word+str.charAt(i);
            if(str.charAt(i)==' ' ){
                ++j;
              arry[j]=word;
              word=" ";
            }
        }
        for(String we:arry){
            System.out.print(we+"");
        }

    }
}