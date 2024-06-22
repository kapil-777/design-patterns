package dp.observerr;



//Subject : have 3 main methods
public interface Subject {

    public void subscribe(Observerr ob); // also : register

    public void unsubscribe(Observerr ob); //also : unregister

    public void newVideoUpload(String title); // also : notify

}
