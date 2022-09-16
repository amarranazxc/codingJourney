public class foreach {
    public static void main(String[] args) {
        String a = "123456";
        int[] v = new int[a.length()];
        for (int i = 0; i <= a.length() - 1; ++i) {
        for(int j=0;j<=a.length()-1;++j)
        {
            v[i]=a;
        }

        }
        for(int h:v){
            System.out.println(h);
        }

    }

}
