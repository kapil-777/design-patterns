package dp.abstractFactory;



public class WebDevFactory extends EmployeeAbstractFactory {
    @Override
    public Employee createEmployee() {
        return new WebDev();
    }
}