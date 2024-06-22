package dp.observerr;

/*
observer dp is behavioural dp : means related to the how the two or more
object can intract or communicate .

Observer Dp : means When there is change in the Subject(main object)  .
it notifies to its all  observers(dependent objects)
*/

public class Main {

    public static void main(String[] args) {

        Subject channel = new YoutubeChannel();

        Observerr hari = new Subscriber("hari"); //new subscriber is created
        Observerr kamal = new Subscriber("kamal");

        channel.subscribe(hari); //add the susbcriber to the channel
        channel.subscribe(kamal);
        channel.unsubscribe(hari);//remove the subscriber from the channel


        channel.newVideoUpload("Design Patterns"); //new video is uploaded and notified to the subscriber
        channel.newVideoUpload("singleton Pattern");


    }

}
