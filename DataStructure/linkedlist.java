public class linkedlist {
    private node head;

    public static class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        node current = head;
        int a=0;//by using this we can print the number of element of a list
        while (current != null) {
            a++;
            System.out.println(current.data + " ");
            current = current.next;

        }
        System.out.println("length of list "+a);
    }

    public void insert1(int value) {
        node temp = new node(value);
        temp.next = head;
        head = temp;
    }

    public void insertlast(int value){
        node temp=new node(value);
        if(head==null){
            System.out.println("here is not a list");
            return;
        }
        node current=head;
        while(null !=current.next)
        {
            current=current.next;
        }
          current.next=temp;      

        
    }
    public void deletfirst(){
        if(head==null){
            System.out.println("there is not any node of list");
            return;
        }
        head=head.next;
    }
    public void deletlast(){
        if(head==null||head.next==null){
            System.out.println("there is not any node");
            return;

        }
        node current=head;
        node previous=null;
        while(current.next!=null){
    previous=current;
    current=current.next;
        }
        previous.next=null;
    }
    public static node merge(node a,node b){
        node dummay=new node(0);
        node tail=dummay;
        while(a!=null&&b!=null){
            if(a.data<b.data){
                tail.next=a;
                a=a.next;
            }
            else{
                tail.next=b;
                b=b.next;
            }
            tail=tail.next;
        }
        if(a==null){
            tail.next=b;
        }
        else{
            tail.next=a;
        }
        return dummay.next;
    }
    public static void main(String[] args) {
        linkedlist l1 = new linkedlist();
      l1.insert1(234);
        l1.insertlast(236);
         linkedlist l2 = new linkedlist();
        l2.insert1(1);
        l2.insertlast(6);
        linkedlist l3 = new linkedlist();
        l3.head=l3.merge(l1.head, l2.head);
        l3.display();
     
       

    }
}