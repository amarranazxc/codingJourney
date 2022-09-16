class javadatatype{
   static  byte a=2;//1byte
   static int b=34;//4byte
   static short c=62;//2byte
   static long d=27;//8byte         //memory representation of data tye
   static float e=442;//4byte
   static double f=34;//8byte
   static char g='a';//2byte
   static String ara="adsf";//8byte
   static int [] arr={1,2,3,4,3,4,5,};
   
    public static void main(String[]args){
        System.out.println(a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+ara);
        System.out.println();
         for(int i=0;i<=arr.length-1;++i){
            System.out.print(+arr[i]+" ");
            int x=a;//wideing type casting
            byte v=(byte) b;//narrowing type casting

        }
    }
}//we can only access out when it will be static
//static instance (variable, methode )call without making a obj of class 