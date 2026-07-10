import java.util.Scanner;

public class ATMSystem {

    double balance = 0;

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " Withdrawn Successfully.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATMSystem atm = new ATMSystem();

        int choice;
        double amount;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount: ₹");
                    amount = sc.nextDouble();
                    atm.deposit(amount);
                    break;

                case 2:
                    System.out.print("Enter Withdrawal Amount: ₹");
                    amount = sc.nextDouble();
                    atm.withdraw(amount);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}