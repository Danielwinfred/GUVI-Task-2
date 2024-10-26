class Account {
    private double balance;

    //(initializes balance to 0)
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with an initial balance
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to depo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw an amount
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to display the current bal
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }

    // Main method
    public static void main(String[] args) {
        Account account1 = new Account();  // Account with no initial balance
        account1.displayBalance();
        account1.deposit(200);
        account1.withdraw(50);
        account1.displayBalance();

        System.out.println();

        Account account2 = new Account(500);  // Account with initial balance
        account2.displayBalance();
        account2.deposit(300);
        account2.withdraw(100);
        account2.displayBalance();
    }
}
