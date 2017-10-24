//Oluwatimi Owoturo Student Number: 8606957
public abstract class Customer{
    private String name;
    private String address;
    private int age;
    private String telephoneNumber;
    private int customerNumber;

    // Super
    public Customer(){
        super();
        name = "";
        address = "";
        age = 0;
        telephoneNumber = "";
        customerNumber = 0;
    }
    //customer constructor
    public Customer(String name, String address, int age, String telephoneNumber, int customerNumber){
        this.name = name;
        this.address = address;
        this.age = age;
        this.telephoneNumber = telephoneNumber;
        this.customerNumber = customerNumber;
    }

    public String getname(){
        return this.name;
    }

    public String getaddress(){
        return this.address;
    }

    public int getage(){
        return this.age;
    }

    public String gettelephoneNumber(){
        return this.telephoneNumber;
    }

    public int getcustomerNumber(){
        return this.customerNumber;
    }

    public void setname(String newname){
        this.name = name;
    }

    public void setaddress(String newaddress){
        this.address = newaddress;
    }

    public void setage(int newage){
        this.age = newage;
    }

    public void settelephoneNumber(String newNumber){
        this.telephoneNumber = newNumber;
    }

    public void setcustomerNumber(int newID){
        this.customerNumber = newID;
    }

    public abstract double getSavingsInterest();
    public abstract double getCheckInterest();
    public abstract int getCheckCharge();
}