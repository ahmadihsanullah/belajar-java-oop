package programmer.zaman.now.application;

import programmer.zaman.now.data.Product;

public class Application extends Product{
    public Application(String name, int harga) {
        super(name, harga);
    }

    public static void main(String[] args) {


        Application application = new Application("Macbook", 30_000_000);
        System.out.println(application.name);
        System.out.println(application.harga);


    }
}
