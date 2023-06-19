package programmer.zaman.now.data;

public enum Level {

    //membuat enum
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    //membuat field
    private String description;

    //membuat constructor
    Level(String description){
        this.description = description;
    }

    //membuat method
    public String getDescription(){
        return this.description;
    }
}
