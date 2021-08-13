/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentModule;

public class EWalletPayment implements Payment{
    private int paymentID;
    private double amount;
    
    @Override
    public int createPayment(double amount){
        //Using random() to represent the paymentID generation
        int generatePaymentID = (int) (1 + Math.random()*100);
        this.paymentID = generatePaymentID;
        this.amount = amount;
        connectEWalletAPI();
        
        return paymentID;
    }
    
    public void connectEWalletAPI(){
        System.out.println("Connecting to EWallet API....");
        System.out.println("Transaction is completed. Total amount = RM" 
                + String.format("%.2f", amount) + ".");
    }
}