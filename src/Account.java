/**
 * This class represents a bank account
 */
public class Account {
    /**
     * @param name Description: Each account object needs a name
     */
    public Account(String name, long accNo) {
        setName(name);
        accountNumber = accNo;
    }

    private final long accountNumber;

    public long getAccountNumber() {
        return accountNumber;
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
     * @return name, returns account name
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
     * @return balance returns current account balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * @param amount adds this amount to total account balance
     */
    public void deposit(double amount) {
        balance += amount;
        messageOutput("Deposit has been made to account: ", amount);
    }

    /**
     * @param amount removes this amount from total account balance
     */
    public void withdrawal(double amount) {
        balance -= amount;
        messageOutput("Withdrawal has been made from account: ", amount);
    }

    public void messageOutput(String message, double amount) {
        printRowDelimiterLine();
        System.out.println(message
                + this.accountNumber + ", "
                + this.getName() + ","
                + " Amount: "
                + amount
                + ", total balance is now: "
                + this.getBalance());
    }

    public void printRowDelimiterLine() {
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}


