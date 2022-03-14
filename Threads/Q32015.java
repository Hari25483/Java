import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q32015 extends Thread{

    int [] a;
    int start;
    int end;
    int s;
    static int count;

//    Q32015(int [] a,int start,int end){
//        this.start=start;
//        this.end=end;
//        this.a=a;
//    }
    Q32015(int s,int [] a){
        this.s=s;
        this.a=a;
    }

    public  static void main(String[] args) throws InterruptedException {
        int[] nums={2, 3, 4,1, 3,7, 9, 1,11,8};
//        Set<Integer> ans=new HashSet<Integer>();
        int ans=findNoofPrimes(nums);
        System.out.println(ans);
    }





    public static int findNoofPrimes(int [] a) throws InterruptedException{
        int threads_length;
        if (a.length%1000==0){
            threads_length=(int)(a.length/1000);
        }
        else {
            threads_length=(int)(a.length/1000)+1;
        }


        Q32015[] threads=new Q32015[threads_length];

        for (int i=0;i<threads_length;i++){
            threads[i]=new Q32015(i,a);
            threads[i].start();
        }
        for (int i=0;i<threads_length;i++){
            threads[i].join();
        }
        return count;
    }

    public void run(){
        for (int j=s*1000;j<((s*1000)+1000);j++){
//            System.out.println(j);
            if(a[j]%2==0){
                count++;
//                System.out.println("count:" +count);
            }
        }
    }
}