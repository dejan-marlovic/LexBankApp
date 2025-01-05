

public class Main {
    public static void main(String[] args) {
        Long account1 = Bank.openAccount("Dejan Marlovic");
        Long account2 = Bank.openAccount("Nils Jacobsen");

        try {
            Bank.getAccount(account1).deposit(5000);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        Bank.getAccount(account2).deposit(5533);

        Bank.accountTransfer(account1, account2, -10);

        Bank.printAccountInfo();

    }
}