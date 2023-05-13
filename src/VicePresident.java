class VicePresident extends Manager {
    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is VP " + this.name);
    }
}
