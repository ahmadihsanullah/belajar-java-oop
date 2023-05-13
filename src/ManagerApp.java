class ManagerApp {
    public static void main(String[] args) {
        var manager = new Manager();
        manager.name = "Ahmad";
        manager.sayHello("Hanif");

        var vicePresident = new VicePresident();
        vicePresident.name = "Ihsan";
        vicePresident.sayHello("iha");
    }
}
