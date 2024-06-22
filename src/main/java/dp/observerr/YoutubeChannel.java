package dp.observerr;



import java.util.ArrayList;
import java.util.List;
//YoutubeChannel : is the main object or subject
public class YoutubeChannel implements Subject{


    List<Observerr> subscribers = new ArrayList<Observerr>();


    public void subscribe(Observerr ob) {

        subscribers.add(ob);
    }


    public void unsubscribe(Observerr ob) {

        subscribers.remove(ob);

    }

    public void newVideoUpload(String title) {
        for(Observerr observerr : this.subscribers) {
            observerr.notified(title);
        }

    }



}

