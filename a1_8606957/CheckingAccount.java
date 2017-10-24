// Oluwatimi Owoturo Student Number: 8606957
public class CheckingAccount extends Account{
    public CheckingAccount(){
        super();
    }
    // Constructor
    public CheckingAccount(Customer customer,double balance,int accountNumber,Transaction[] transactions){
        super(customer,balance, accountNumber, transactions); //Parsing value to Account
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