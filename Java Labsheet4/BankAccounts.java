public class BankAccounts {
    double balance;
    static String bankCode = "BANK101";

    BankAccounts(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) {
        double withdrawalAmount = amount;

        if (withdrawalAmount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (withdrawalAmount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal successful.");
        }

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Available Balance: Rs. " + balance);
    }

    public static void main(String[] args) {
        double initialBalance = 5000;
        double amount = 1500;

        BankAccounts account = new BankAccounts(initialBalance);
        account.withdraw(amount);
    }
}
