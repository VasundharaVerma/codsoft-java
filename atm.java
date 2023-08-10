import java.util.Scanner;
public class atm {
     private double balance;

    public atm(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false; // Insufficient balance
        }
        balance -= amount;
        return true; // Successful withdrawal
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initialBalance = 1000;
        atm a = new atm(initialBalance);
        while(true){
        System.out.println("Welcome to the ATM Machine!");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter deposit amount: ");
                double depositAmount = sc.nextDouble();
                a.deposit(depositAmount);
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = sc.nextDouble();
                boolean success = a.withdraw(withdrawAmount);
                if (success) {
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient balance. Withdrawal failed.");
                }
                break;
            case 3:
                double balance = a.getBalance();
                System.out.println("Your account balance is: " + balance);
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option. Please try again.");
        }
        }
    }
}
