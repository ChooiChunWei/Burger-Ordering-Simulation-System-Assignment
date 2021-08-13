package MenuModule;

public abstract class Burger {
    String description = "Burger";
    public String getDescription() {
        return description;
    }
    
    public abstract double price();
}
