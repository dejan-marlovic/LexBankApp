import java.util.HashMap;

public class Bank {
    static HashMap<Long ,Account> accounts = new HashMap<Long,Account>();
    static private long accountCounter = 0;
    private Bank() {}

    static long openAccount(String name) {
        accounts.put(generateAccountNumber(), new Account(name, generateAccountNumber()));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println("You have opened an account under name: " + name);
        return accountCounter;
    }

    static void printAccountInfo() {
        for (Account account : accounts.values()) {
            System.out.println("--------------------------------------------------------------------------------------------");
            System.out.println("Account: " + account.getName() + " has a balance of: " + account.getBalance());
        }
    }

    private static long generateAccountNumber(){
        return accountCounter++;
    }

    public static Account getAccount(Long accountNumber){
        return accounts.get(accountNumber);
    }

    static void accountTransfer( long fromAcc, long toAcc, double amount ){

    }
}
