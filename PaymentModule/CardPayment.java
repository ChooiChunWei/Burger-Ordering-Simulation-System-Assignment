/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentModule;

public class CardPayment implements Payment{
    private int paymentID;
    private double amount;
    
    @Override
    public int createPayment(double amount){
        //Using random() to represent the paymentID generation
        int generatePaymentID = (int) (1 + Math.random()*100);
        this.paymentID = generatePaymentID;
        this.amount = amount;
        connectCardAPI();
        
        return paymentID;
    }
    
    public void connectCardAPI(){
        System.out.println("Connecting to Card API....");
        System.out.println("Transaction is completed. Total amount = RM" 
                + String.format("%.2f", amount) + ".");
    }
}
