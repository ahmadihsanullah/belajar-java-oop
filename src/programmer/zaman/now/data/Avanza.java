package programmer.zaman.now.data;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public void getBrand() {
        System.out.println("Toyota");
    }

    public boolean isMaintenance() {
        return false;
    }
}
