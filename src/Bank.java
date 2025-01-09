import java.util.HashMap;

public class Bank {
    static HashMap<Long, Account> accounts = new HashMap<Long, Account>();
    static private Long accountCounter = 0L;

    private Bank() {
    }

    /**
     * Creates a new account of type Account and adds it to accounts HashMap. Uses generate
     * generateAccountNumber to generate unique account number.
     *
     * @param name passes name argument to Account constructor.
     * @return returns newly generated account number.
     */
    static Long openAccount(String name) {
        Long account = generateAccountNumber();
        accounts.put(account, new Account(name, account));
        printRowDelimiterLine();
        System.out.println("You have opened an account under name: " + name);
        return accountCounter;
    }

    static void printAccountInfo() {
        for (Account account : accounts.values()) {
            printRowDelimiterLine();
            System.out.println("Account: "
                    + account.getName()
                    + " has a balance of: "
                    + account.getBalance());
        }
    }

    private static Long generateAccountNumber() {
        return ++accountCounter;
    }

    /**
     * @param accountNumber looks up accountNumber in the HashMap
     * @return returns corresponding account object
     */
    public static Account getAccount(Long accountNumber) {
        if (accounts.get(accountNumber) == null) {
            throw new IllegalArgumentException("No account found under no: " + accountNumber);
        } else {

            return accounts.get(accountNumber);
        }

    }

    /**
     *
     * @param fromAcc Long value account number to transfer from
     * @param toAcc Long value account number to deposit to.
     * @param amount amount to be transferred between accounts
     */
    static void accountTransfer(Long fromAcc, Long toAcc, double amount) {
        printRowDelimiterLine();
        System.out.println("Starting transaction between accounts!");
        try {
            accounts.get(fromAcc).withdrawal(amount);
            accounts.get(toAcc).deposit(amount);
            System.out.println("Transaction completed successfully!");

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            printRowDelimiterLine();
        }
        printRowDelimiterLine();
    }

    static void printRowDelimiterLine() {
        System.out.println("---------------------------------------------------------------------------------------------------------");
    }
}
