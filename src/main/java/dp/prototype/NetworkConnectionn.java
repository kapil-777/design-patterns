package dp.prototype;



import java.util.ArrayList;
import java.util.List;

//make class cloneable by : implementing Cloneable interface and its clone method
public class NetworkConnectionn implements Cloneable{

    private String ip ;
    private String data;

    private List<String> domain = new ArrayList<String>();




    public NetworkConnectionn() {
//		System.out.println("creating network connection...");
    }



    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }


    public void loadData() throws InterruptedException {
        this.data = "very large data";
        this.domain.add("www.google.com");
        this.domain.add("www.kaps.com");
        this.domain.add("www.fb.com");
        Thread.sleep(5000);
    }




    public List<String> getDomain() {
        return domain;
    }



    public void setDomain(List<String> domain) {
        this.domain = domain;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {

        //logic for the deep copy : make the object and return

        NetworkConnectionn networkConnectionn = new NetworkConnectionn();
        networkConnectionn.setIp(this.getIp());
        networkConnectionn.setData(this.getData());
        for(String dom : this.getDomain()) {
            networkConnectionn.getDomain().add(dom);
        }

        return networkConnectionn;
    }

    @Override
    public String toString() {
        return ip + " : " + data + " : " + this.getDomain();
    }


}
