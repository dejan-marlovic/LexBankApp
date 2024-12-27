import java.util.ArrayList;

public class Bank {
    static ArrayList<Account> accounts = new ArrayList<Account>();

    private Bank() {}

    static void openAccount(String name) {
        accounts.add(new Account(name));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("You have opened an account under name: " + name);
    }

    static void printAccountInfo() {
        for (Account account : accounts) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Account: " + account.getName() + " has a balance of: " + account.getBalance());
        }
    }
}
