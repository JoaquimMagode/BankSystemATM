import java.util.Scanner;

public class BankSys {
    int idCode, contactNumber;
    String firstName, lastName;
    float amount, balance, rates;
    boolean status;

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

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }



    void displayOptions(){
        System.out.print("[ 1 ] Balance \n[ 2 ] Deposit \n[ 3 ] Withdraw \n[ 4 ] Check Balance \n[ 5 ] Exit \n[ >> ] Enter: ");
        optValue = in.nextInt();
        switch (optValue){
            case 1:
                balance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
        }
    }

    void balance(){
        System.out.println("Balance Test");
    }
    void deposit(){
        System.out.println("Deposit Test");
    }
    void withdraw(){
        System.out.println("Withdraw Test");
    }
    void checkAcc(){
        System.out.println("Check Account Terms Test");
    }

}
