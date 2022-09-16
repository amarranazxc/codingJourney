public class doubllylinklist {
    private listnode head;
    private listnode tail;

    static class listnode {
        private static int data;

        private listnode next;
        private listnode privious;

        public listnode(int data) {
            this.data = data;
            this.next = null;
            this.next = null;
        }
    }

    doubllylinklist() {
        this.head = null;
        this.tail = null;
    }

    public static void display() {
        listnode temp = head;
        while (temp != null) {
            System.out.println(temp + "-->");
            temp = temp.next;
        }
        System.out.println("wqe");
    }

    public static void main(String[] args) {
        
    }
}
