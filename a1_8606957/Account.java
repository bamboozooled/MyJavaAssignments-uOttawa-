public class Account{
    protected Customer customer;
    protected double balance;
    protected int accountNumber;
    protected Transaction[] transactions = new Transaction[20];

    public Account(){
        super();
        Customer customer;
        balance = 0.0;
        accountNumber = 0;
        transactions = new Transaction[20];
    }
    // Creating Account constructor
    public Account(Customer customer,double balance, int accountNumber, Transaction[] transactions){
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.transactions = transactions;
        this.customer = customer;
    }
        private void reallocate(Transaction[] transactions){  //REallocate
        Transaction[] newArray = new Transaction[0];
        int i;
        int k;
        int u=0;
        for (k=0; k<transactions.length;k++){
            if (k == transactions.length-1){ // Checking to see if array is full
                u=transactions.length;
            }
        }
        if (u == transactions.length){
            for (i=0; i<transactions.length; i++){
                newArray=new Transaction[u*2];
                newArray[i] = transactions[i];
            }
        }
        transactions = newArray;

    }

    public double getBalance(){
        return this.balance;
    }

    public int getAccountNum(){
        return this.accountNumber;
    }

    public Customer getCustomer(){ // Getting customer
        return customer;
    }

    public String toString(int accountNumber){
        String accountNumber1;
        accountNumber1 = Integer.toString(accountNumber);
        return accountNumber1;
    }

    public void setCustomer(Customer customer1){
        this.customer = customer1;
    }

    public void deposit(double amount){
        this.balance =this.balance+amount;
    }

    public void withdrawal(double amount){
        this.balance = this.balance-amount;
    }
    
}