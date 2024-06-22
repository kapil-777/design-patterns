package dp.abstractFactory;



class AndroidDev implements Employee {
    public int salary() {
        return 5000;
    }

    public String name() {
        System.out.println("i am android developer");
        return "ANDROID DEVELOPER";
    }
}