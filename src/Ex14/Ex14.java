package Ex14;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error, please try again");
        }
        if (balance < 0) {
            System.out.println("Error, please try again");
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

public class Ex14 {
    public static void main(String[] args) {
        Account account = new Account("01123", 238000);

        System.out.println("계좌: " + account.getAccountNumber());
        System.out.println("잔액: " + account.getBalance());
    }
}
