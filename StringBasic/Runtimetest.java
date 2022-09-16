class Runtimetest{
    public static void main(String[]args){//this use to check th espace before and after the garbage collectore
        Runtime zxc=Runtime.getRuntime();
        System.out.println(zxc.freeMemory()); 
         System.out.println(zxc.freeMemory());
        zxc.gc();
        System.out.println(zxc.);
        System.out.println(zxc.freeMemory());
    }
}