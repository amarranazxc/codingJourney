public class clone {
    public static void main(String[] args) {
        int arr[]={123,54,765,3234,34568,76543,};
        int sd[]=arr.clone();//it also implement cloneable interface
        for(int t:sd){
            System.out.println(t);
        }
    }
}
