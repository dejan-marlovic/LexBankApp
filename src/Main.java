public class Main {
    public static void main(String[] args) {
       long account1 = Bank.openAccount("Dejan Marlovic");
       long account2 = Bank.openAccount("Nils Jacobsen");
        Bank.accounts.get(account1).deposit(3999);
        Bank.accounts.get(account1).deposit(5533);
        Bank.accounts.get(account2).withdrawal(3000);

        Bank.printAccountInfo();

    }
}