// Oluwatimi OWoturo Student Number: 8606957
public class Transaction{
    public Customer customerNumber;
    public Bank transactionType;
    public double amount;
    public String date;
    public String fees;
    // Constructor
    public Transaction(Customer customerNumber, Bank transactionType, double amount, String date, String fees){
        this.customerNumber = customerNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.date = date;
        this.fees = fees;
    }
    public void processTran(){
        
    }


}