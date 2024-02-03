import java.util.Scanner;

public class BankAccount {
    String firstName, lastName;
    int mobileNumber;
    int age;
    Scanner in = new Scanner(System.in);

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

    public int getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(int mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void displayOptions(){
        System.out.print("First Name: ");
        setFirstName(in.next());
        System.out.print("Last Name: ");
        setLastName(in.next());
        System.out.print("Age: ");
        setAge(in.nextInt());
        System.out.print("Mobile Number: ");
        setMobileNumber(in.nextInt());
        BankSys i2 = new BankSys();
        i2.deposit(true);
    }

    void createAccount(String firstName,String lastName,int age){
        if (age < 19)
        {
            System.out.println("Student Account "+getFirstName());
        }else {
            System.out.println("Saving Account");
        }

    }
}
