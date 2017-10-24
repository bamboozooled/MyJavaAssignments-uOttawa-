// Oluwatimi owoturo Student Number:8606957
public class SavingsAccount extends Account{

    public SavingsAccount(){
        super();
    }
    // Constructor
    public SavingsAccount(Customer customer,double balance,int accountNumber,Transaction[] transactions){
        super(customer,balance, accountNumber, transactions); //Parsing values to Account
    }
    public void deposit(double amount){
        this.balance =this.balance+amount;
    }

    public void withdrawal(double amount){
        this.balance = this.balance-amount;

    }
    public void addInterest(){
        
    }
}