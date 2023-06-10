

public class polymorphism {//methode overloading is the best example to display polymorphism in oops concepts
    //methode overloading -- declaring the methode same  name in same class but difrent parameter

    public static void sum() {
        System.out.println(2+2);
        
    }
    public static void sum(int a , int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        sum(2, 4);
        sum();
    }
    
}
