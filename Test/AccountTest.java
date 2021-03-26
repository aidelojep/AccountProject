import java.util.Scanner;

public class AccountTest{

    public static void main(String[] args){

    Account myAccount1 = new Account("Peter Aideloje", 190000.00);
    Account myAccount2 = new Account("Kemi Yusuf", 100000.00);

    Scanner input = new Scanner(System.in);

        System.out.printf("The default account details of %s: $%.2f%n", myAccount1.getName(), myAccount1.getBalance());

        System.out.printf("The default account details of %s: $%.2f%n", myAccount2.getName(), myAccount2.getBalance());

        System.out.println();

        System.out.println("Kindly enter your deposit amount");
        double deposit = input.nextDouble();
        System.out.println("Processing your TRANSACTION in a bit!");
        double makeDeposit;
        System.out.println("The new account details for account1 is :" + deposit);
        myAccount1.makeDeposit(deposit);

        System.out.printf("The new balance for account1 is %s: %d%n", myAccount1.getBalance());
        System.out.println("Thank you for Banking with us!!");
}

        }

