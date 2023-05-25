public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Ahmad");
        employee.sayHello("Ihsan");

        employee = new Manager("ahmad");
        employee.sayHello("Ihsan");

        employee = new VicePresident("Ahmad");
        employee.sayHello("Ihsan");


        sayHello(new Employee("Ahmad"));
        sayHello(new Manager("Ahmad"));
        sayHello(new VicePresident("Ahmad"));
    }

       static void sayHello(Employee employee) {
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name) ;
        }else {
            System.out.println("Hello " + employee.name);
        }
       }
}
