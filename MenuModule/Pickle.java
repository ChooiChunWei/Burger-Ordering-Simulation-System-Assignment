package MenuModule;

public class Pickle extends ToppingDecorator{
    public Pickle(Burger burger){
        super(burger);
    }
    
    @Override
    public String getDescription() {
        return burger.getDescription() + " +Pickle";
    }

    @Override
    public double price() {
        return 1.00+ burger.price();
    }
}
