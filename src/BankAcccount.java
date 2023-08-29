class BankAccount {
    private String AccnNum;
    private double balance;

    BankAccount(String AccnNum, double balance) {
        this.AccnNum = AccnNum;
        this.balance = balance;
    }

    public String getAccountNum() {
        return AccnNum;
    }

    public double getbalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawl completed");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public static void main(String args[]) {
        BankAccount user = new BankAccount("33333", 55555.5);
        System.out.println("Account Number: " + user.getAccountNum());
        System.out.println("Initial BAlance: " + user.getbalance());
        user.withdraw(1234);
        System.out.println("BAlance: " + user.getbalance());

    }
}


