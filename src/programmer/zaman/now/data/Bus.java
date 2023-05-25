package programmer.zaman.now.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus Drive");
    }
    public int getTier() {
        return 8;
    }

    public void getBrand() {
        System.out.println("Toyota");
    }

    public boolean isMaintenance() {
        return true;
    }

    public boolean isBig() {
        return true;
    }
}
