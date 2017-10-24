// Oluwatimi Owoturo Student Number: 8606957
public class Senior extends Customer{
    private final double SAVINGS_INTEREST = 0.08;
    private final double CHECK_INTEREST = 0.04;
    private final int CHECK_CHARGE = 1;
    private final int OVERDRAFT_PENALTY = 10;

    public Senior(){
        super();
    }

    public Senior(String name, String address, int age, String telephoneNumber, int customerNumber){
        super(name,address,age,telephoneNumber,customerNumber);
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