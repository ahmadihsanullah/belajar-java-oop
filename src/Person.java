class Person {
    String name;
    String address;
    final String country = "Indonesia";

//    create constructor
    Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    Person(String paramName){
        this(paramName, null);
    }

    Person(){
        this(null);
    }
    void sayHello(String paramName){
        System.out.println("Hello " + paramName + " my name is " + this.name);
    }
}
