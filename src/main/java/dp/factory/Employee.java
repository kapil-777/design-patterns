package dp.factory;



interface Employee {
    int salary();
}

class AndroidDev implements Employee {
    public int salary() {
        System.out.println("android developer");
        return 50000;
    }
}

class WebDev implements Employee {
    public int salary() {
        System.out.println("web developer");
        return 40000;
    }
}

class NoDev implements Employee{
    public int salary(){
        System.out.println("give name of developer");
        return 0;
    }
}

