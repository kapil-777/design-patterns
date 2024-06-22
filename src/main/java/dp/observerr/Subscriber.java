package dp.observerr;



//Subscriber : is depended on the main object : YoutubeChannel
public class Subscriber implements Observerr{

    private String name ;

    public Subscriber(String name) {
        this.name = name;
    }

    public void notified(String title) {
        System.out.println( "Hello "+ this.name +" new video uploaded : "+title);

    }

}

