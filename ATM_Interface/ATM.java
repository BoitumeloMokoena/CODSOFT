package ATM_Interface;

import java.util.Scanner;

public class ATM {
    private final BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        System.out.println("Welcome to the BM ATM! 🏦");
        System.out.println("Thank you for trusting us with your money 💰");
        System.out.println("1. Withdraw 💸");
        System.out.println("2. Deposit 💳");
        System.out.println("3. Check Balance 📊");
        System.out.println("0. Exit 🚪");
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Please select a number from above: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful 💸");
                    } else {
                        System.out.println("Insufficient funds! 😕");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    System.out.println("Deposit successful 💳");
                    break;
                case 3:
                    System.out.println("Your balance is: R" + account.getBalance() + " 💰");
                    break;
                case 0:
                    System.out.println("Thank you for using the BM ATM. Goodbye! 👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again ☹️");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }

    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000); // Initial balance set to R1000
        ATM atm = new ATM(userAccount);
        atm.start();
    }
}
