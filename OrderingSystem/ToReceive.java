package OrderingSystem;

public class ToReceive implements State{
    @Override
    public void updateStatus(Order order) {
        //Using System.out.println to represent the complex implementations
        System.out.println(
            "The customer received the order."
        );
        order.setStateToStatus(new Completed());

    }
}
