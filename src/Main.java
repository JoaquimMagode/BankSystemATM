import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int optValue;
        Scanner in = new Scanner(System.in);
        BankAccount i1 = new BankAccount();
        BankAccount i1sent = new BankAccount();
        BankSys i2 = new BankSys();
        System.out.println("------------------------------------------------------");
        System.out.println("---------------------BANK SYSTEM----------------------");
        System.out.println("------------------------------------------------------");
        System.out.print("[ 1 ] Open Account \n[ 2 ] Main Operation\n[ 0 ] Exit\n[ >> ] Enter: ");
        optValue = in.nextInt();

        switch (optValue){
            case 1:
                i1.displayOptions();
                break;
            case 2:
                i1.displayOptions();
                break;
            case 0:
                System.out.println("Thanks for use our Program. See You later");
                break;
            default:
                System.out.println("Error of Value Not Recognized");
        }
    }
}