
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the initial amount for the first card:" );
        double balance1 = getInitialBalance(scanner);
        CreditCard card1 = new CreditCard("111-222", balance1);


        System.out.println("Enter the initial amount for the second card:");
        double balance2 = getInitialBalance(scanner);
        CreditCard card2 = new CreditCard("222-333", balance2);

        System.out.println("Enter the initial amount for the third card:");
        double balance3 = getInitialBalance(scanner);
        CreditCard card3 = new CreditCard("333-444", balance3);

        System.out.println("Deposit first card: ");
        card1.depositMoney(scanner.nextInt());

        System.out.println("Deposit second card: ");
        card2.depositMoney(scanner.nextInt());


        System.out.println("withdraw third card: ");
        card3.withdrawMoney(scanner.nextInt());


        System.out.println("Current carts ballance: ");
        card1.printInfo();
        card2.printInfo();
        card3.printInfo();

    }
    private static double getInitialBalance(Scanner scanner) {
        double balance = -1;
        while (balance < 0) {
            System.out.print("Please enter a positive number: ");
            balance = scanner.nextDouble();
            if (balance < 0) {
                System.out.println("balance cannot be less than 0 ");
            }
        }
        return balance;
    }
}