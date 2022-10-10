class fabo{
   
    public static void main(String[] args) {
        faboni(5);
        
    }
    public static void faboni(int count){
        int a=1,b=1,c=0;
        if(count>0){
        c=a+b;
        System.out.println(c+" ");
        a=b;
        b=c;
       
        faboni(count-1);
            

        }

    }
}