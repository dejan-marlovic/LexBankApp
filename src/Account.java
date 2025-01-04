/**
 * This class represents a bank account
 */
public class Account {
    /**
     * @param name Description: Each account object needs a name
     */
    public Account(String name, long accNo) {
        if (name.matches(".*\\d.*")){
            throw new IllegalArgumentException("Name can not contain numbers!");
        }
        if(name.length() <= 2){
           throw new IllegalArgumentException("Name has to be longer than 2 characters!");
        }
        if (name.matches("^-.*|.*-$")) {
            throw new IllegalArgumentException("Name can not start or end with a hyphen!");
        }

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
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount can not be negative!");
        }
        balance += amount;
        messageOutput("Deposit has been made to account: ", amount);
    }

    /**
     * @param amount removes this amount from total account balance
     */
    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount can not be negative!");
        }
        if (balance - amount < 0)
        {
            throw new IllegalArgumentException("Can not withdrawal amount: "
                                                + amount +" from account. Insufficient funds!");
        }
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


