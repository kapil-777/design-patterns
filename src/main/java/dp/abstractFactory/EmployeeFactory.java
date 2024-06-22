package dp.abstractFactory;

public class EmployeeFactory {
    public static Employee getEmployee(EmployeeAbstractFactory eaf){
        return eaf.createEmployee();
    }
}