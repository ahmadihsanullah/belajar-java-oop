class Employee {
    String name;

    Employee(String name){
        this.name = name;
    }

    void sayHello(String name){
        System.out.println("Hello " + name + " my name is employee " + this.name);
    }
}
