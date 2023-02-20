public class linked{
 private static node head;
  public static class node{
    int data;
    node next;
    node(int data){
      this.data=data;
      this.next=null;
    }
  }
  public static void add(int data){
    node newnode=new node(data);
    node current=head;
    if(head==null){
      head=newnode;
    }
     while(current!=null){
       current=current.next;
     }
     current=newnode;

  }
  public static void print(){
    node current=head;
    while(current!=null){
      System.out.println(current.data);
      current=current.next;
    }

  }
  public static void main(String []args){
    linked zxc=new linked();
    zxc.add(123);
    zxc.add(234);
    zxc.print();

  }
}