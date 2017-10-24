// Oluwatimi Owoturo Student Number: 8606957
public class Adult extends Customer{
    
    private final double SAVINGS_INTEREST = 0.03;
    private final double CHECK_INTEREST = 0.01;
    private final int CHECK_CHARGE = 3;
    private final int OVERDRAFT_PENALTY = 25;

    public Adult(){
        super();
    }
    //Constructor
    public Adult(String name, String address, int age, String telephoneNumber, int customerNumber){
        super(name,address,age,telephoneNumber,customerNumber); // Parsing value Customer
    }


    public double getSavingsInterest(){
        return SAVINGS_INTEREST;
    }

    public double getCheckInterest(){
        return CHECK_INTEREST;
    }

    public int getCheckCharge(){
        return CHECK_CHARGE;
    }
}