import java.lang.Thread;
class sync extends Thread {
    public static void main(String[] args) {
       sync zxc=new sync();
       sync xc=new sync();
       System.out.println(   zxc.run(3));
       System.out.println(   xc.run(12));
    
       

    }
    public  String run(int num){
        int number=10;
       if( 0>(number =number-num) ){
           return "thberisnovalue";
       }
       else{
           return"there is";
       }

    }
}