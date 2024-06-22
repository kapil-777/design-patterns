package dp.factory;

//this is Factory class that return the objects of the childClass based on the client input , in the client side ;

class EmployeeFactory{
    public static Employee getEmployee(String emp){

        if(emp.trim().equalsIgnoreCase("ANDROID DEVELOPER")){
            return new AndroidDev();
        }
        else if(emp.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDev();
        }
        else{
            return new NoDev();
        }
    }
}