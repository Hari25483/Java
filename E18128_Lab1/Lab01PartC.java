import java.util.Locale;

public class Lab01PartC {
    
    public static void main(String args[]) {
      String month = "JANUARY"; // example
        for (String arg: args){
//            System.out.println(args[0]);
            month=arg.toUpperCase();
        }
      showMonthValue(month);
    }
    
    public static void showMonthValue(String month){
        int monthValue =0;
//        System.out.println(month);

        //Implement C a
        if (month.equals("JANUARY")){
            monthValue=1;
        }
        else if (month.equals("FEBRUARY")){
            monthValue=2;
        }
        else if (month.equals("MARCH")){
            monthValue=3;
        }
        else if (month.equals("APRIL")){
            monthValue=4;
        }
        else if (month.equals("MAY")){
            monthValue=5;
        }
        else if (month.equals("JUNE")){
            monthValue=6;
        }
        else if (month.equals("JULY")){
            monthValue=7;
        }
        else if (month.equals("AUGUST")){
            monthValue=8;
        }
        else if (month.equals("SEPTEMBER")){
            monthValue=9;
        }
        else if (month.equals("OCTOBER")){
            monthValue=10;
        }
        else if (month.equals("NOVEMBER")){
            monthValue=11;
        }
        else if (month.equals("DECEMBER")){
            monthValue=12;
        }
        System.out.println(monthValue);


        //Implement C b
//        String month;
        monthValue+=1;
        while (true) {
            if (monthValue==13){
                break;
            }
            if (monthValue == 1) {
                month = "JANUARY";
            } else if (monthValue == 2) {
                month = "FEBRUARY";
            } else if (monthValue == 3) {
                month = "MARCH";
            } else if (monthValue == 4) {
                month = "APRIL";
            } else if (monthValue == 5) {
                month = "MAY";
            } else if (monthValue == 6) {
                month = "JUNE";
            } else if (monthValue == 7) {
                month = "JULY";
            } else if (monthValue == 8) {
                month = "AUGUST";
            } else if (monthValue == 9) {
                month = "SEPTEMBER";
            } else if (monthValue == 10) {
                month = "OCTOBER";
            } else if (monthValue == 11) {
                month = "NOVEMBER";
            } else if (monthValue == 12) {
                month = "DECEMBER";
            }
            System.out.println(month);
            monthValue+=1;
        }

    }
    
}