public class Lab01PartB {

    public static void main(String args[]) {
        int number =3; // example
        //O as the default number if no arguments are given.
        int numb=0;
        for (String arg : args) {
//            System.out.println(arg);
            numb=Integer.parseInt(arg);
        }
//        System.out.println(numb);
        findEvenOrOdd(numb);
    }

    public static void findEvenOrOdd(int number){
        //Implement B a
        int mod=0;
        mod=number%2;
        String type=null;
        if (mod==1){
            type="Odd";
        }
        else{
            type="Even";
        }
//        System.out.println(type);
        //Implement B b
        int numb=number;
        if (type.equals("Even")) {
            for (int i = 0; i < 5; i++) {
                numb = numb + 2;
                System.out.println(numb);
            }
        }
        else{
            for (int i=0;i<3;i++){
                numb=numb+2;
                System.out.println(numb);
            }
        }
    }
}