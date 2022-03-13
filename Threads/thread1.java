public class thread1 {
    public static void main (String[] args){
        Samplethread threadguru1=new Samplethread("thread1");
        threadguru1.start();
        Samplethread threadguru2=new Samplethread("thread2");
        threadguru2.start();
    }
}

class Samplethread implements Runnable{
    Thread Guruthread;
    private String gurname;
    Samplethread(String name){
        gurname=name;
    }
    public void run(){
        System.out.println("Thread running "+gurname);
        for (int i=0;i<4;i++){
            System.out.println(i);
            System.out.println(gurname);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }

        }
    }

    public void start(){
        System.out.println("Thread started");
        if (Guruthread==null){
            Guruthread= new Thread(this,gurname);
            Guruthread.start();
        }
    }
}