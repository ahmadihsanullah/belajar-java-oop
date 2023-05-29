package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

public class Customer {
    private String name;

    private Level level;

    @Fancy(name="Ahmad", tags = {"Belajar", "OOP", "Java"})
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
