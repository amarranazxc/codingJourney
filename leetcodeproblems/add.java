import java.util.*;
class linkedlist{
   static node head;
   static class node {
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static  void addelement(int  data){
        node newnode=new node(data);
        head=newnode;
        head=head.next;
    }
}
class add extends linkedlist {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        linkedlist l1=new linkedlist();
        linkedlist l2=new linkedlist();
        while(scan.hasNext()){
            l1.addelement(scan.nextInt());
        }
        while(scan.hasNext()){
            l2.addelement(scan.nextInt());
        }
    }
    
      
    
}


