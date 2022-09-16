//we cannt access  a private variable of a another class  but by using getter and setter 
//methode we can acess them this tecnique is a part of encapsulatio in which importtant 
//data we should hide to user 
public class ecapsutation {  
    public static void main(String[]args){
        student a=new student();
        a.name
        a.setName("amar rana");
        System.out.println(a.getName());


    }  
}
 class student{
     private String name;
     public String getName(){//this getter methide in which we use capital name of our
        //varible
         return name;
     }
     public void setName(String amar){
         this.name=amar;

     }
 }