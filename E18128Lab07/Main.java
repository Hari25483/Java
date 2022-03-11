
public class Main {

    public static void main(String[] args) {
        Agency Agency1= new Agency();

        //Declaring news channels with names
        News_Channel n1=new News_Channel("Shakthi News");
        News_Channel n2=new News_Channel("Roobavakini News");
        News_Channel n3=new News_Channel("BBC News");
        News_Channel n4=new News_Channel("IBC News");
        News_Channel n5=new News_Channel("Dan News");


        //Agency1 regusters all news channels requested
        Agency1.register(n1);
        Agency1.register(n2);
        Agency1.register(n3);
        Agency1.register(n4);
        Agency1.register(n5);



        //Notify the news to all the channels
        Agency1.upload(" Market value of Dollars has increased");
        System.out.println();
        Agency1.upload(" Economic Ciris in Sri Lanka");
    }
}
