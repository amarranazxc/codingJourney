public class LinkedList {
    private node head;

    public static class node  {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {

        node current = head;
        int a = 0;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
            a++;
        }
        System.out.print("length of a list " + a);
    }

    public void insert1(int value) {
        node newnode = new node(value);
        newnode.next = head;
        head = newnode;
    }

    public void insertlast(int value) {
        node fgh = new node(value);
        if (head == null) {
            System.out.println("here is not a list");
            return;
        }
        node current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = fgh;

    }

    public void search(int value) {
        node current = head;
        int a = 0;
        while (current != null) {
            a++;
            if (current.data == value) {
                System.out.println("element is available at list " + a);
            }
            current = current.next;
        }
    }

    public void rever() {
        node current = head;
        node previous = null;
        node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            System.out.print(previous.data + " ");
        }

    }

    public node searchatlast(int n) {
        node refptr = head;
        node mainptr = head;
        int count = 0;
        while (count < n) {
            refptr = refptr.next;
            count++;
        }
        while (refptr != null) {
            refptr = refptr.next;
            mainptr = mainptr.next;
        }
        return mainptr;

    }

    public void dup() {// function of this methode to remove the duplicate of the list thst is sorted
        node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public boolean checkloop() {
        node slow = head;// this method for check the list loop contion
        node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                return true;
        }
        return false;
    }

    public static void merge(node a, node b) {
        node dummy = new node(5);
        node tail = dummy;
        while (a != null && b != null) {
            if (a.data <= b.data) {

            }

        }
    }

    public static void main(String[] args) {
        copyofnode zxc = new copyofnode();

        zxc.insert1(1);
        zxc.insertlast(16);
        zxc.insertlast(1);
        zxc.insertlast(18);
        zxc.dup();
       System.out.println( "this for list loop "+zxc.checkloop());
       zxc.display();
        copyofnode xcv=new copyofnode();
        xcv.insert1(23);
        xcv.insertlast(45);
        xcv.insertlast(56);
        xcv.display();
      
    }
}
