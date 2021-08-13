package MenuModule;

public abstract class ToppingDecorator extends Burger{
    protected Burger burger;
    public ToppingDecorator(Burger burger){
        this.burger = burger;
    }
    
    @Override
    public abstract String getDescription();
    
    @Override
    public abstract double price();
}
