package OrderingSystem;

public class ToCook implements State{
    @Override
    public void updateStatus(Order order) {
        //Using System.out.println to represent the complex implementations
        System.out.println(
            "The kitchen done preparing the order." 
            + "Informed and waiting for delivery."
        );
        
        order.setStateToStatus(new ToDeliver());
    }
}
