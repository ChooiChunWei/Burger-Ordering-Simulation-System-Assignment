package OrderingSystem;

public class ToDeliver implements State{
    @Override
    public void updateStatus(Order order) {
        //Using System.out.println to represent the complex implementations
        System.out.println(
            "The order is out for delivery."
        );
        order.setStateToStatus(new ToReceive());

    }
}
