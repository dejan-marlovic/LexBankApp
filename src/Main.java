public class Main {
    public static void main(String[] args) {
        Long account1 = Bank.openAccount("Dejan Marlovic");
        Long account2 = Bank.openAccount("Nils Jacobsen");
        Bank.getAccount(account1).deposit(3000);
        Bank.getAccount(account2).deposit(5533);

        Bank.accountTransfer(account1, account2, 2000.45);

        Bank.printAccountInfo();

    }
}