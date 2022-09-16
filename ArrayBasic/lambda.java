interface demo{
    public void displayname();//this is function interface in that has only one abstract method
}
public class lambda {
    public static void main(String[] args) {
        demo zxc=()->{System.out.println("amar rana");};//()->this lambda expression in java
        // that reduce the code
        //size and make the progrmae very effective look here we no need to 
        //create the object(instances )of the interface
        //
        zxc.displayname();
    }
   
    
}
