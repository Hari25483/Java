import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;


public class Agency {
    private String news;
    //Create an array list in order to maintain a
    List<News_Channel> channels=new ArrayList<>();
    private  String title;

    //News channels registering / subscribing to agency
    public void register(News_Channel channel){
        channels.add(channel);
    }

    //News channels unregistering to agency
    public void unregister(News_Channel channel){
        channels.remove(channel);
    }

    //Function to notify all the channels if a message is passed by the agency
    public void notifyChannels(){
        for (News_Channel chan: channels){
            chan.update(chan.getName(),news);
        }
    }

    //Upload a news by agency
    //Once the news is updated, all the channels will be notified.
    public void upload(String news){
        this.news=news;
        notifyChannels();
    }

}
