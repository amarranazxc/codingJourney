//Question=what are the use of static class in java
//we can use the static keyword with varible,nested class,methode,block
//VARIABLE these are use to static because we can call them without create the obj
public class outter {

    static String v = "amar";

    public static int sum(int q, int w) {
        int add = q + w;
        return add;
    }

    static class inner {
        public static void check() {
            System.out.println(v);
            System.out.println(sum(3, 5));
        }
    }

    static {
        System.out.println("bilochpur");
    }

    public static void main(String[] args) {
        inner zx=new inner();
        
    }

}
