import java.util.Scanner;

class Account {
    static int balance = 0;
    static Scanner input = new Scanner(System.in);

    static void deposit() {
        System.out.print("Enter amount: ");
        int amount = input.nextInt();
        balance += amount;
        System.out.println("Amount credited\nBalance: " + balance);
    }
    
    static void withdraw() throws MinBalExp {
        System.out.print("Enter the amount to withdraw: ");
        int amount = input.nextInt();
    
        if (amount > balance) {
            throw new MinBalExp("You do not have sufficient balance to withdraw");
        } else {
            balance -= amount;
            System.out.println("Transaction successful\nBalance: " + balance);
        }
    }
    
    public static void main(String args[]) throws MinBalExp {
        System.out.println("Deposit some cash into your account: ");
        deposit();
    
        while (true) {
            System.out.print("Do you want to continue:\n(y) yes, (n) no: ");
    
            char option = input.next().charAt(0);
    
            if (option == 'y') {
                System.out.print("(1) Deposit, (2) Withdraw: ");
                int continueOption = input.nextInt();
                if (continueOption == 1) {
                    deposit();
                } else if (continueOption == 2) {
                    withdraw();
                } else {
                    System.out.println("Invalid option");
                }
            } else if (option == 'n') {
                System.out.println("Balance: " + balance);
                break;
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    
    static class MinBalExp extends Exception {
        MinBalExp(String message) {
            super(message);
        }
    }
    
}
