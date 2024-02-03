import java.util.Scanner;

public class BankSys {
    int idCode, contactNumber;
    String firstName, lastName;
    float amount, balance, rates;

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

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    void displayOptions(){
        System.out.print("[ 1 ] Balance \n[ 2 ] Deposit \n[ 3 ] Withdraw \n[ 4 ] Check Balance \n[ 5 ] Exit \n[ >> ] Enter: ");
        optValue = in.nextInt();
    }

    void balance(){

    }
}
