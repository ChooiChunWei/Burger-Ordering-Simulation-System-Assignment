package OrderingSystem;

public class Creating implements State{
    @Override
    public void updateStatus(Order order) {
        //Using System.out.println to represent the complex implementations
        System.out.println(
            "Received payment and created order. "
            + "Sending the order to kitchen."
        );
        
        order.setStateToStatus(new ToCook());

    }
}

