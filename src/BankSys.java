import java.util.ArrayList;
import java.util.Scanner;

public class BankSys {
    int idCode, contactNumber;
    String firstName, lastName;
    float amount, balance, rates;
    boolean status;

    ArrayList<Object> userBank = new ArrayList<>();

    public ArrayList<Object> getUserBank() {
        return userBank;
    }

    public void setUserBank(ArrayList<Object> userBank) {
        this.userBank = userBank;
    }

    Scanner in = new Scanner(System.in);

    int optValue;

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getRates() {
        return rates;
    }

    public void setRates(float rates) {
        this.rates = rates;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    void displayOptions(){
        while (true){
            System.out.print("[ 1 ] Balance \n[ 2 ] Deposit \n[ 3 ] Withdraw \n[ 4 ] Check Account \n[ 5 ] Go to Main \n[ >> ] Enter: ");
            optValue = in.nextInt();
            switch (optValue){
                case 1:
                    balance();
                    BankSys i1;
                    i1 = (new BankSys());
                    i1.displayOptions();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    for (Object o : getUserBank()) System.out.println(o);
                    System.out.println("Accounting Check...");
                    break;
                case 5:
                    break;
            }
            if (optValue == 0){
                break;
            }
        }
    }

    void balance(){
        System.out.println("Balance Test:  "+getBalance());
    }
    void deposit(boolean status){
        if (status == true){
            System.out.println("Already to Make a Deposit on Account");
            System.out.print("Amount: ");
            setAmount(in.nextFloat());
            setBalance(getAmount()+getBalance());
        }
        System.out.println("Deposit Test "+ getStatus());
    }

    void withdraw(){
        System.out.println("Withdraw Test");
    }
    void checkAcc(){
        System.out.println("Check Account Terms Test");
    }

}
