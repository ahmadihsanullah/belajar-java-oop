class VicePresident extends Manager {
    VicePresident(String name){
        super(name);
    }
    @Override
    void sayHello(String name) {
        System.out.println("Hello " + name + " my name is VP " + this.name);
    }
}
