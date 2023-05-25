class Parent {
    String name;
    void doIt(){
        System.out.println("Do it from parent");
    }

}

class Child extends Parent{
    String name;

    @Override
    void doIt() {
        System.out.println("Do it from child");
    }
}
