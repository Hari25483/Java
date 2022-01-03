import java.util.*;

public class TestArray{
    public static void main(String[] args){
        List <String> lst=new ArrayList<>();
        lst.add("Alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);

        Object[] strArray1=lst.toArray();
        System.out.println(Arrays.toString(strArray1));

        String[] strArray2=lst.toArray(new String[lst.size()]);
        System.out.println(strArray2.length);
    }
}