package dp;

import  dp.factory.*;
public class Main {
    public static void main(String[] args) {

// --------------------singleton ---------------------------------------

        // lazy way
        // Singleton ss = Singleton.getSingleton();
        // System.out.println(ss.hashCode());
        // System.out.println(ss.hashCode());

        // Eager e = Eager.getEager();
        // Eager e2 = Eager.getEager();
        // System.out.println(e);
        // System.out.println(e2);
        // System.out.println(Eager.getEager());

        // System.out.println(ThreadSafeSingle.getThreadSafeSingle());
        // System.out.println(ThreadSafeSingle.getThreadSafeSingle());

        // break singleton using Reflection api:
        // SingletonReflApi sr = SingletonReflApi.getSingletonReflApi();
        // System.out.println(sr);
        // SingletonReflApi sr1 = SingletonReflApi.getSingletonReflApi();
        // System.out.println(sr1);

        // breaking start
        // Constructor<SingletonReflApi> cons =
        // SingletonReflApi.class.getDeclaredConstructor();
        // cons.setAccessible(true);//by this new object is created
        // SingletonReflApi ss = cons.newInstance();
        // System.out.println(ss);

        // soluiton 1 : a :
        // System.out.println(SingletonReflApiSl.getSingletonReflApiSl());
        // Constructor<SingletonReflApiSl> cons1 =
        // SingletonReflApiSl.class.getDeclaredConstructor();
        // cons.setAccessible(true);// by this new object is created
        // SingletonReflApiSl sss = cons1.newInstance();
        // System.out.println(sss);

        // solutin 1 : b : using enums;
        // SingleSl2 ss2 = SingleSl2.INSTANCE;
        // System.out.println(ss2.hashCode());

        // SingleSl2 ss1 = SingleSl2.INSTANCE;
        // System.out.println(ss1.hashCode());
        // ss1.hi();

// --------------------singleton ------------end---------------------------


        // factory DP : when there are many chlid classes of parent class . it gives the
        // object of the child class based on input : using factory class

//        Employee emp = EmployeeFactory.getEmployee("Web Developer");
//        int salary = emp.salary();
//        System.out.println("web dev : "+ salary);

    }

}