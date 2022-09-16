class Amar extends Thread {
  @Override
  public void run() {//this tread job by using start methode we can excute the thread job 

    try {
      for (int i = 0; i <= 10; i++) {
        sleep(1000);
        System.out.println("amar rana");
      }

    } catch (Exception e) {
      System.out.println(e);
    }
  }

  public static void main(String[] args) {
    Amar zxc = new Amar();
    Amar xc = new Amar();
xc.start();
    zxc.start();

  }

}