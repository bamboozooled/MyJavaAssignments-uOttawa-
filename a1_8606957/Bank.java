//Oluwatimi Owoturo Student # 8606957
/*
 * Bank.java
 *
 * Created on July 21, 2004, 1:23 AM
 */

public class Bank{
    private static Account[] accounts;
    private int size;
    private int capacity;
    
    private static final int SAVINGS = 0;
    private static final int CHECKING = 1;    
    private static final int SENIOR = 0;
    private static final int ADULT = 1;    
    private static final int STUDENT = 2;
    private static final int INIT_CAPACITY = 100;
    private static int i=0;
    
    static int customerNumber = 1;
    static int indexx;
    
    static int accountNum = 1;

    private static Account account1; 
    
    

    
    
    
    /** Creates a new instance of Bank */
    public Bank(){
        accounts = new Account[INIT_CAPACITY];
    }


    
    /********************************************************************
     * Creates a new account.
     * pre: customer information must be not null and types must be valid
     * post: New account added to bank
     * @param customerName String Account owner's name
     * @param customerAddress String Owner's address
     * @param customerAge int Owner's age (in years)
     * @param customerPhoneNumber String Owner's phone number
     * @param customerType int Owner's type of customer within bank
     * @param typeAccount int Account type (savings or checking)
     * @return String New account number
     */
    public String addAccount(String customerName, String customerAddress, 
                             int customerAge, String customerPhoneNumber, 
                             int customerType, int typeAccount){

                                 
                                 //Creating Accounts
                                 if (typeAccount == 0 && customerType == 1){ 
                                    account1 = new SavingsAccount(new Adult(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                    accountNum++;
                                    customerNumber++;
                                 }
                                  else if (typeAccount == 0 && customerType == 0){
                                     account1 = new SavingsAccount(new Senior(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                     accountNum++;
                                     customerNumber++;
                                 }
                                  else if (typeAccount == 0 && customerType == 2){
                                     account1 = new SavingsAccount(new Student(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                     accountNum++;
                                     customerNumber++;
                                 }
                                 else if (typeAccount == 1 && customerType == 1){
                                     account1 = new CheckingAccount(new Adult(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                     accountNum++;
                                     customerNumber++;
                                 }
                                  else if (typeAccount == 1 && customerType == 0){
                                     account1 = new CheckingAccount(new Senior(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                     accountNum++;
                                     customerNumber++;
                                 }

                                  else if (typeAccount == 1 && customerType == 2){
                                     account1 = new CheckingAccount(new Student(customerName,customerAddress,customerAge,customerPhoneNumber, customerNumber),0.0,accountNum,new Transaction[20]);
                                     accountNum++;
                                     customerNumber++;
                                     accounts[i] = account1;
                                 }

                                 accounts[i] = account1;
                                 i++; //Incrementing assinging value

                                 return Integer.toString(account1.getAccountNum());



                             }
    
    /***********************************************************************
     * Make a deposit into account.
     * pre: amount must be a positive integer
     * post: Account's balance increases
     * @param accountNumber String Account's number
     * @param amount double Amount to deposit
     * @return double New balance
     */
    public static String makeDeposit(String accountNumber, double amount){
        accounts[getAccount2(accountNumber)].deposit(amount);
        return Double.toString(accounts[getAccount2(accountNumber)].getBalance());  
    }
    
    /***********************************************************************
     * Make a withdrawal from account.
     * pre: amount must be a positive integer
     * post: Account's balance decreases
     * @param accountNumber String Account's number
     * @param amount double Amount to withdraw
     * @return double New balance
     */    
    public static String makeWithdrawal(String accountNumber, double amount){
        accounts[getAccount2(accountNumber)].withdrawal(amount);
        return Double.toString(accounts[getAccount2(accountNumber)].getBalance());       
    }

    /***********************************************************************
     * Returns account information as a string so it can be displayed
     * @param accountNumber String Account's number
     * @return String Account information as a String object
     */    
    public String getAccount(String accountNumber){
        String a="";
        int k;
        int y = Integer.parseInt(accountNumber);
        for(k=0; k  <  accounts.length; k++){
            
            if (accounts[k].getAccountNum() == y){
                
                a = "Balance: "+Double.toString(accounts[k].getBalance()) + " Account Number: "+ Integer.toString(accounts[k].getAccountNum());
                
                break;
            }
        }

        return a;
    }
    // Creating another getAccount method to return index of account number.
    public static int getAccount2(String accountNumber){
        int k;
        int a=0;
        int y = Integer.parseInt(accountNumber);
        
        for(k=0; k  <  accounts.length; k++){
            
            if (accounts[k].getAccountNum() == y){
                
                a=k;
                
                break;
            }
        }

        return a;
    }
    
    /***********************************************************************
     * Given an account number tells if the account exists or not
     * @param accountNumber String Account's number
     * @return int TRUE if accountNumber exists in accounts[]. Otherwise, -1.
     */    
    private static int find(String accountNumber){
        int a=0;
        int i;
        int temp = Integer.parseInt(accountNumber);

        for (i=0; i<accounts.length;i++){
            if (accounts[i].getAccountNum() == temp){
                indexx=i;
                a=1;
                break;
            }

            else{
                a=-1;
            }
        }

        return a;
    }

 /***********************************************************************


    /** You need to create private method : Allocate to allocate a new array to hold the transactions. */
    //Reallocate method.
    private void reallocate(){
        Account[] newArray = new Account[0];
        int i;
        int k;
        int u=0;
        for (k=0; k<accounts.length;k++){
            if (k == accounts.length-1){
                u=accounts.length;
            }
        }
        if (u == accounts.length){
            for (i=0; i<accounts.length; i++){
                newArray=new Account[u*2];
                newArray[i] = accounts[i];
            }
        }
        accounts = newArray;


    }
}

