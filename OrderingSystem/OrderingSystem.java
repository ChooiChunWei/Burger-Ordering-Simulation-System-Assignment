package OrderingSystem;

import MenuModule.*;
import java.util.Arrays;
import java.util.List;

public class OrderingSystem
{
    public static void main(String[] args) {
        Burger burger1 = new ChickenBurger();
        burger1 = new Cheese(burger1);
        burger1 = new Cheese(burger1);
        burger1 = new Pickle(burger1);
        System.out.println("Name = " + burger1.getDescription());
        System.out.println("Price = RM" 
                + String.format("%.2f", burger1.price()));

        Burger burger2 = new FishBurger();
        burger2 = new Cheese(burger2);
        burger2 = new Cheese(burger2);
        burger2 = new Pickle(burger2);
        System.out.println("Name = " + burger2.getDescription());
        System.out.println("Price = RM" 
                + String.format("%.2f", burger2.price()));

        List<Burger> orderedBurgerArray1 = Arrays.asList(burger1,burger2);
        
        Order a = new Order();
        a.createOrder("111, jalan 11, Taman Sungai Besi, 57100 Kuala Lumpur.",
                orderedBurgerArray1, 101);
        a.trackStatus();
        
        a.updateStatus();
        a.trackStatus();
        
        a.updateStatus();
        a.trackStatus();
        
        a.updateStatus();
        a.trackStatus();
        
        System.out.println("=================================================");
        Burger burger3 = new ChickenBurger();
        System.out.println("Name = " + burger3.getDescription());
        System.out.println("Price = RM" 
                + String.format("%.2f", burger3.price()));
        
        List<Burger> orderedBurgerArray2 = Arrays.asList(burger3);   
        
        Order b = new Order();
        b.createOrder("98, jalan 2, Taman Gembira, 57100 Kuala Lumpur.",
                orderedBurgerArray2, 100);
        b.trackStatus();
        
        b.updateStatus();
        b.trackStatus();
        
        b.updateStatus();
        b.trackStatus();
        
        b.updateStatus();
        b.trackStatus();
    }
}



