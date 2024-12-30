import java.util.HashMap;

public class Bank {
    static HashMap<Long ,Account> accounts = new HashMap<Long,Account>();
    static private Long accountCounter = 0L;
    private Bank() {}

    static Long openAccount(String name) {
        Long account = generateAccountNumber();
        accounts.put(account, new Account(name, account));
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("You have opened an account under name: " + name);
        return accountCounter;
    }

    static void printAccountInfo() {
        for (Account account : accounts.values()) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("Account: " + account.getName() + " has a balance of: " + account.getBalance());
        }
    }

    private static Long generateAccountNumber(){
        return ++accountCounter;
    }

    public static Account getAccount(Long accountNumber){
        return accounts.get(accountNumber);
    }

    static void accountTransfer( Long fromAcc, Long toAcc, double amount ){
        accounts.get(fromAcc).withdrawal(amount);
        accounts.get(toAcc).deposit(amount);
        System.out.println("---------------------------------------------------------------------------------------------------------");
        System.out.println("Transaction complete!!!");
    }
}
