import java.util.HashSet;
import java.util.Set;

public class Q3 extends Thread {
    int[] a;
    int start;
    int end;
    static Set <Integer> odd=new HashSet <Integer> ();

    Q3(int start, int end, int[] a) {
        this.a = a;
        this.end = end;
        this.start = start;
    }
    public  static void main(String[] args) throws InterruptedException {
        int[] nums={2, 3, 4,1, 3,7, 9, 1,11};
        Set <Integer> ans=new HashSet<Integer>();
        ans=findOdds(nums);
        System.out.println(ans);
    }



    public static synchronized Set<Integer> findOdds(int [] a) throws InterruptedException{

        int k=(int) (a.length/4);

        Q3[] threads=new Q3[4];
        for (int i=0;i<3;i++){
            threads[i]=new Q3(i*k,(i*k)+k,a);
            threads[i].start();
        }
        threads[3]=new Q3(3*k,a.length,a);
        threads[3].start();
        for (int i=0;i<4;i++){
            threads[i].join();
        }
        return odd;
    }

    public void run(){
        for (int i=start;i<end;i++){
            if (a[i]%2==1){
                Integer num=a[i];
                odd.add(num);
            }
        }
    }

}