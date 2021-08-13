package MenuModule;

public class FishBurger extends Burger {
    public FishBurger(){
        description = "Fish " + super.getDescription();
    }
    
    @Override
    public double price() {
        return 4.50;
    }
}
