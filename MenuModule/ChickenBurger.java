package MenuModule;

public class ChickenBurger extends Burger{
    public ChickenBurger(){
        description = "Chicken " + super.getDescription();
    }
    
    @Override
    public double price() {
        return 3.00;
    }
}
