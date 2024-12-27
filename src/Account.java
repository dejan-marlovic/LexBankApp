/**
 * This class represents a bank account
 */
public class Account {
    /**
     * @param name Description: Each account object needs a name
     */
    public Account(String name) {
        this.name = name;
    }

    /**
     * Stores account name
     */
    private String name;
    /**
     * Stores current account balance
     */
    private double balance;

    /**
     * @return returns account name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets account name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return balance returns current account balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param balance sets current account balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     *
     * @param amount adds this amount to total account balance
     */
    public void deposit(double amount) {
        balance += amount;
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("You have deposited: "
                + amount
                + " to account "
                + this.name
                + " total balance is now: "
                + this.getBalance());
    }

    /**
     *
     * @param amount removes this amount from total account balance
     */
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
