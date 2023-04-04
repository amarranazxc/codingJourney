public class ll {
    static node head;

    static class node {
        public int data;
        public node link;

        node(int data) {
            this.data = data;
            link = null;

        }
    }

    public static void add(int data) {
        node newnode = new node(data);
        if (head == null) {
            head = newnode;

        }
        node current = head;
        while (current != null) {
            current = current.link;

        }
        current.link = newnode;
       
    }

    public static int count() {
        node current = head;
        int counter = 0;
        while (current != null) {
            counter++;
            current = current.link;
        }
        return counter;
    }
    public static node merge(node a,node b){
        node a1=a.head;
        node b1=b.head;
        while(a!=null&&b!=null){
            if(a.data<b.data){
                a1.link=b;
                a1=a1.link;
            }
            else{
                a1.next=
            }
            
        }
    }

    public static void main(String[] args) {
        ll lnk = new ll();
        lnk.add(123);
        lnk.add(123);
        lnk.add(123);
        lnk.add(123);
        lnk.add(123);
        lnk.add(123);
        System.out.println(lnk.count());
    }

}
