package OrderingSystem;

import MenuModule.Burger;
import java.util.Date;
import PaymentModule.EWalletPayment;
import java.util.List;

public class Order{
    private int orderID,  paymentID, customerID;
    private Date orderTime;
    private String deliveryAddress;
    private double totalAmount;
    private List<Burger> orderedBurger;
    private State status;

    public void createOrder(String deliveryAddress, List<Burger> orderedBurger,
            int customerID){
        System.out.println("\nCreating order...");
        //set variables
        //Using random() to represent the orderID generation
        int generateOrderID = (int) (1 + Math.random()*100);
        this.orderID = generateOrderID;
        this.customerID = customerID;
        this.deliveryAddress = deliveryAddress;
        this.orderedBurger = orderedBurger;
        this.status = new Creating();
        //Calculate the total amount
        this.totalAmount = calcTotalAmount(orderedBurger);
        
        //generate current time to represent the orderTime generation
	Date date = new Date();
        this.orderTime = date;
        
        //Pay before proceed
        //Assume the customer chose either one payment method
        EWalletPayment eWallet = new EWalletPayment();
        this.paymentID = eWallet.createPayment(totalAmount);
        //Successfully paid, update status 
        this.updateStatus();
    }
    
    public void setStateToStatus(State state) {
        this.status = state;
    }
    
    public void updateStatus(){
        this.status.updateStatus(this);
    }
    
    public void trackStatus(){
        System.out.println("The current status of this order is: " 
                + this.status.getClass().getSimpleName() + ".\n");
    }
    
    public double calcTotalAmount(List<Burger> orderedBurger){
        return orderedBurger.stream()
                .map(burger -> burger.price())
                .mapToDouble(Number::doubleValue)
                .sum();
    }
}
