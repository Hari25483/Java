import java.util.HashSet;
import java.util.Set;

public class oddnum  extends Thread {
    int matrix[];
    int start, end;
    static Set<Integer> odd = new HashSet<>();

    public oddnum(int start,int end, int [] matrix){
        this.start=start;
        this.end=end;
        this.matrix=matrix;
    }

    public  static void main(String[] args) throws InterruptedException {
        int[] nums={2, 3, 4,1, 3,7, 9, 1,11,15};
        Set <Integer> ans=new HashSet<Integer>();
        ans=findOdd(nums);
        System.out.println(ans);
    }


    public static Set<Integer> findOdd(int [] a ) throws InterruptedException
    {
        int len=a.length/4;
        oddnum[] threads=new oddnum[4];
        for (int i=0;i<3;i++){
            threads[i]=new oddnum(i*len,(i*len)+4,a);
            threads[i].start();
        }
        threads[3]=new oddnum(3*len,a.length,a);
        threads[3].start();

        for (int i=0;i<4;i++){
            threads[i].join();
        }
        return odd;
    }


    public void run(){
        for (int i=start;i<end;i++){
            if(matrix[i]%2==1){
                odd.add(matrix[i]);
            }
        }
    }
}