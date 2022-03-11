public class News_Channel {
    private String name;
    private Agency agency=new Agency();

    public News_Channel(String name) {
        this.name = name;
    }

    //Update news according to news channel name, and news
    public  void update(String name, String news){
        System.out.println("Hey "+name+ "!,"+news);
    }


    //Getter and Setter functions for News channels
    public String getName() {
        return name;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
    }

    public void register_Agency(Agency agency){
        this.agency=agency;

    }


}
