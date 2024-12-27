public class Account {

    public Account(String name) {
        this.name = name;
    }

    private String name;
    private double balance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("You have deposited "
                + amount
                + " to account "
                + this.name
                + " total balance is now: "
                + this.getBalance());
    }

    public void withdrawal(double amount) {
        balance -= amount;
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("You just made a withdrawal of "
                + amount
                + " from account "
                + this.name
                + " total balance is now: "
                + this.getBalance());
    }
}
