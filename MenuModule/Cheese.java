package MenuModule;

public class Cheese extends ToppingDecorator{
    public Cheese(Burger burger){
        super(burger);
    }
    
    @Override
    public String getDescription() {
        return burger.getDescription() + " +Cheese";
    }

    @Override
    public double price() {
        return 2.00+ burger.price();
    }
}
