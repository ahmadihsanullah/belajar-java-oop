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
        System.out.println("Hello " + employee.name);
    }
}
