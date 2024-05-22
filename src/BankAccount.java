import java.util.Scanner;
import java.util.ArrayList;
public class BankAccount {
    String firstName, lastName;
    int mobileNumber;
    int age;
    Scanner in = new Scanner(System.in);

    ArrayList<Object> savedUser = new ArrayList<>();

    public ArrayList<Object> getSavedUser() {
        return savedUser;
    }

    public void setSavedUser() {
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

    void savedAccount(){

    }
    void displayOptions(){


        System.out.print("First Name: ");
        savedUser.add(in.next());
        System.out.print("Last Name: ");
        savedUser.add(in.next());
        System.out.print("Age: ");
        savedUser.add(in.nextInt());
        BankSys bankSys = new BankSys();
        System.out.println("-----------------------------------------------------------------------------");
        for (Object o : getSavedUser()) System.out.println(o);
        bankSys.setUserBank(getSavedUser());
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("You Account was Successful created.");

        bankSys.displayOptions();
}

    private void setSavedUser(boolean add) {
       // add = savedUser.add(in.next());
    }
    }
