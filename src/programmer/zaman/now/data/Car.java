package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name="Car", tags = {"Belajar", "OOP", "Java"})
public interface Car extends HasBrand, IsMaintenance{
    void drive();

    int getTier();

    default boolean isBig(){
        return false;
    }
}
