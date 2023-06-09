package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name="Ahmad", tags = {"Belajar", "OOP", "Java"})
public class Category {
    private String name;

    private boolean expensive;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null){
            this.name = name;
        }
        this.name = this.name;
    }

    public boolean isExpensive() {
        return expensive;
    }

    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
