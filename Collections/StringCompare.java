import java.util.*;

public class StringCompare{
    public static void main (String[] args){
        String [] strarray={"Hello","hi","HI","Hey","HELLO"};
        Arrays.sort(strarray);
        System.out.println(Arrays.toString(strarray));

        System.out.println(Arrays.binarySearch(strarray,"HI"));

        List <Integer> lst=new ArrayList<>();
        lst.add(22);
        lst.add(11);
        lst.add(4);
        Collections.sort(lst);
        System.out.println(lst);
        System.out.println(Collections.binarySearch(lst ,22));
        }
    }