import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int optValue;
        Scanner in = new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("---------------------BANK SYSTEM----------------------");
        System.out.println("------------------------------------------------------");
        System.out.print("[ 1 ] Open Account \n[ 2 ] Main Operation\n[ >> ] Enter: ");
        optValue = in.nextInt();
        switch (optValue){
            case 1:
                BankAccount i1 = new BankAccount();
                i1.displayOptions();
                BankSys i2 = new BankSys();
                i2.displayOptions();
                break;
            case 2:
                BankSys i3 = new BankSys();
                i3.displayOptions();
                break;
            default:
                System.out.println("Error of Value Not Recognized");
        }
    }
}