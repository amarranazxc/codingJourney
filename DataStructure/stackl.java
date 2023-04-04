public class stackl {
    static node head;
static class node {
        int data;
        node link;
       node  next;
        node (int data){
            this.data=data;
           this. link=null;
        }
        
       
    }
    public static void push(int data){
        node newnode=new node(data);
        newnode.next=head;
        head=newnode;


    }
    public static void diplay(){
        node currentnode=head;
        while(currentnode!=null){
            System.out.println(currentnode.data);
            currentnode=currentnode.next;

        }

    }
    public static void main(String[] args) {
        stackl stc=new stackl();
        stc.push(1234);
        stc.push(1234);
        stc.push(1234);
        stc.push(1234);
        stc.push(1234);
        stc.push(1234);
        stc.diplay();
    }
   
}
