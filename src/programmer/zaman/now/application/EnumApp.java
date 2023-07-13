package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Ahmad");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //mendapatkan nilai enum
        String level =  Level.VIP.name();
        System.out.println(level);

        //memasukan nilai sesuai yang sudah ada di enum
        Level nilai = Level.valueOf("PREMIUM");
        System.out.println(nilai);

        //mencetak semua nilai enum
        System.out.println("Print level");
        for(var value: Level.values()){
            System.out.println(value);
        }
    }
}
