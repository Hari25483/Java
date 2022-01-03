import java.util.*;
public class Sublist{
    public  static  void main(String[] args){
        List <Integer> lst=new ArrayList<>();
        for (int i=0;i<10;i++){
            lst.add(i*10);
        }
        System.out.println(lst);

        lst.subList(3,6).clear();
        System.out.println(lst);
    }
}