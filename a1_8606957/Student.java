// Oluwatimi Owoturo Student Number: 8606957
public class Student extends Customer{
    private final double SAVINGS_INTEREST = 0.07;
    private final double CHECK_INTEREST = 0.03;
    private final int CHECK_CHARGE = 2;
    private final int OVERDRAFT_PENALTY = 20;

    public Student(){
        super();
    }
    // Constructor
    public Student(String name, String address, int age, String telephoneNumber, int customerNumber){
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