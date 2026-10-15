class BankAccountDetails {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid initial balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }

    public void displayAccount() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }
}

public class BankAccountValidation {
    public static void main(String[] args) {
        BankAccountDetails account = new BankAccountDetails();

        account.setAccountNumber("1234567890");
        account.setAccountHolder("Saloni");
        account.setBalance(5000);

        account.deposit(1000);
        account.withdraw(2000);
        account.withdraw(10000);
        account.deposit(-500);

        account.displayAccount();
    }
}
