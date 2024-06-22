package dp.abstractFactory;



public class ClientFact{
    public static void main(String a[]){

        System.out.println("di");
        Employee e = EmployeeFactory.getEmployee(new AndroidDevFactory());
        e.name();


    }
}