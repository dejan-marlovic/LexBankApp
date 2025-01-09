

public class Main {
    public static void main(String[] args) {
        Long account1 = Bank.openAccount("Dejan Marlovic");
        Long account2 = Bank.openAccount("Nils Jacobsen");

        try {
            Bank.getAccount(account1).deposit(1000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Bank.getAccount(account2).deposit(1000);

        //testing normal transaction
        Bank.accountTransfer(account1, account2, 100);

        //testing too high amount
        Bank.accountTransfer(account1, account2, 10000);

        //testing negative amount
        Bank.accountTransfer(account1, account2, -500);

        //testing rollback scenario
        Bank.accountTransfer(account1, (long)5, 100);

        Bank.printAccountInfo();

    }
}