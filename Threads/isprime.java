import java.util.HashSet;
import java.util.Set;

public class isprime extends Thread{
 static int count;
 int start;
 int end;
 int [] matrix;

 isprime(int start,int end,int [] matrix){
     this.start=start;
     this.end=end;
     this.matrix=matrix;
 }
// arr[2500]
// public void increment(int count){
//     count++;
// }

    public  static void main(String[] args) throws InterruptedException {
        int[] nums={2, 3, 4,1, 3,7, 1,11,15};
        int ans;
        ans=findprimeNo(nums);
        System.out.println(ans);
    }

 public static int findprimeNo(int [] matrix) throws InterruptedException {
     int len=matrix.length/1000;
     //2500/1000=2.5
     isprime[] threads=new isprime[len+1];

     int i=0;
     for (i=0;i<len;i++){
         threads[i]=new isprime(i*1000,(i*1000)+1000,matrix);
         threads[i].start();
     }
     threads[i]=new isprime(i*1000,matrix.length,matrix);
     threads[i].start();
     for (int j=0;j<len+1;j++) {
         threads[j].join();
     }
     return count;
 }

 public void run(){
     for(int i=start;i<end;i++){
         if (matrix[i]%2==1){
             count++;
         }
     }
 }

}
