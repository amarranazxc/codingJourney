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
    public static void main(String[] args) {
        linkedlist zxc = new linkedlist();
        zxc.insert1(5789);
        zxc.insert1(456);
        zxc.insertlast(2345);
        zxc.insertlast(23456);
        zxc.deletfirst();
        zxc.deletlast();
        zxc.display();

    }
}