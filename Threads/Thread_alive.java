public class Thread_alive {
    public  static void main(String[] args) throws InterruptedException {
        Thread t1=Thread.currentThread();

        System.out.println(t1);

        System.out.println(t1.isAlive());
    }
}
