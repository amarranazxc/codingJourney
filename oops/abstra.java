interface vhical {
    void milage();// by default methode is public ,abstract

    void price();// interface is use to achieve 100% abstaraction in java
                 // variable is by default public static final
                 // interface is use when client says to build the application to devloper
                 // then devloper writeb the client requrement in interafec in interface

}

class abstra  implements vhical{
    @Override// overriding this is use to give tge body to intterface methode as well to costomize the methode according to 
    //to use 
    public void milage(){
        System.out.println("very good milage car");

    }
    @Override //this is annotation that annoatate to jvm that  thia is methode of prent or interface calss 
    public void price(){
        System.out.println("price is very affordable");
    }
    public  void meassage(){
        System.out.println("meassage for chaeck the interface accessability");
    }
    public static void main(String[] args) {
        
      
    

}