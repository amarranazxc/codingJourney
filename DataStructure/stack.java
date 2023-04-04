import java.util.ArrayList;

class stack {
   static ArrayList list=new ArrayList<>();//implementation by arraylist
    public static void  push(int data){
        
        list.add(data);

    }
    public static  void pop() {
list.remove(list.size()-1);
        
    }
    public static void main(String[] args) {
        stack sd=new stack();
        sd.push(1234);
        sd.push(1234);
        sd.push(1234);
        sd.push(1234);
        sd.push(1234);
        stack.pop();
        System.out.println(list);
    }
    
}
