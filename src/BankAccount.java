public class BankAccount {
    String firstName, lastName;
    int mobileNumber;
    int age;

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

    void createAccount(String firstName,String lastName,int age){
        if (age < 19)
        {
            System.out.println("Student Account");
        }else {
            System.out.println("Saving Account");
        }

    }
}
