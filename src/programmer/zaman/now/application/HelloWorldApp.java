package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        HelloWorld english = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }
            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        HelloWorld indonesia = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }
            @Override
            public void sayHello(String name) {
                System.out.println("Halo " + name);
            }
        };

        english.sayHello();
        english.sayHello("ahmad");
        indonesia.sayHello();
        indonesia.sayHello("ihsan");
    }
}
