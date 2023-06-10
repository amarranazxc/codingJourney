import java.util.jar.Attributes.Name;

public class encapsulation {// inner class is also very important concept in encapsulation
    static  class inner{
        public static void outterdis(){
            System.out.println(ctc);
        }    }

    int id =123;//keep the variable and methode togrther is encapsulation here class keep all variable in one class
    String name ="amar";
     static int ctc=10;
    public static void basesalary(){
        if(ctc>100){
        int bs=ctc/100;
        int base=bs*80;
        System.out.println(base);}
        else
        System.out.println("its not a salary,it bahtta");

    }
    public static void main(String[] args) {
      encapsulation.inner obj=new encapsulation.inner();
      obj.outterdis();
        basesalary();
    }

    
}
