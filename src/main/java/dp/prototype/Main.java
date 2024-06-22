package dp.prototype;




//prototype DP : says : create the clone of the object : that object takes too much time for cal. complex calculations :
//eg : network connection , db connection etc

public class Main {

    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {

        NetworkConnectionn networkConnectionn = new NetworkConnectionn();
        networkConnectionn.loadData();
        networkConnectionn.setIp("192.168.0.12");
//		System.out.println(networkConnectionn);


        //cloning  : copy of the object
        //shallow copy



        NetworkConnectionn networkConnectionn2 = (NetworkConnectionn) networkConnectionn.clone();
//		System.out.println(networkConnectionn2);





        System.out.println(networkConnectionn);
        networkConnectionn.getDomain().remove(0); //ref. changed : changed in both so, this shallow copy
        System.out.println(networkConnectionn);
        System.out.println(networkConnectionn2);



        System.out.println("\n------------------------------------------------------\n");

        //deep copy : also cloning the refss. that are present in the object ;

//		NetworkConnectionn nc = new NetworkConnectionn();
//		nc.loadData();
//		nc.setIp("192.168.0.12");
//		System.out.println(nc);
//
//		nc.getDomain().remove(0); //ref. changed : not changed in both so, this shallow copy
//		System.out.println(nc);
//
//		NetworkConnectionn nc2 = (NetworkConnectionn) nc.clone();
//		System.out.println(nc2);
//


    }

}
