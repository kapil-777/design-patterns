package dp.abstractFactory;


class WebDev implements Employee {
    public int salary() {
        return 40000;
    }

    public String name() {
        System.out.println("i am web developer");
        return "WEB DEVELOPER";
    }
}