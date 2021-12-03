import java.time.LocalDate;
import java.time.Period;
public class Lab01PartD {
    
    public static void main(String args[]) {
      int countryCode = Integer.parseInt(args[1]); // example
      String birthDate = args[0]; // example
        if ((countryCode>8)|| (countryCode<1)){
            System.out.println("Invalid country code");
            System.exit(1);
        }

        int birthyear=Integer.parseInt(birthDate.substring(0,4));
        int birthmonth=Integer.parseInt(birthDate.substring(5,7));
        int birthdate=Integer.parseInt(birthDate.substring(8,10));
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(birthyear, birthmonth, birthdate);

        Period p = Period.between(birthday, today);

        int age=p.getYears();

        LocalDate Date = LocalDate.now(); // Create a date object
        String currentDate = Date.toString();


      System.out.println(age);
      showTicketPrice(countryCode, age);
    }
    
    public static void showTicketPrice(int CountryCode , int age){
        double extraprice=0.0;
        double discount=0.0;
        double ticketprice=200;
        if (age>=65){
            discount=0.5;
        }
        if (age<=5){
            discount=1.0;
        }
        ticketprice=ticketprice-(discount*ticketprice);

        if (CountryCode==7){
            extraprice=0.0*ticketprice;
        }
        else if (CountryCode==8){
            extraprice=0.65*ticketprice;
        }
        else {
            extraprice=0.35*ticketprice;
        }
        ticketprice=ticketprice+extraprice;
        //implement D - Calculate ticket price and show ticket price

        System.out.println(ticketprice);
    }
}