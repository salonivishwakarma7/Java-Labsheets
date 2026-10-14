public class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "State Bank";

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        double depositAmount = amount;

        if (depositAmount > 0) {
            balance = balance + depositAmount;
            System.out.println("Deposit Successful.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        int accountNumber = 1001;
        double initialBalance = 5000.0;
        double amount = 2000.0;

        BankAccount account =
                new BankAccount(accountNumber, initialBalance);

        account.deposit(amount);
        account.displayDetails();
    }
}
