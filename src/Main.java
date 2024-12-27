public class Main {
    public static void main(String[] args) {
        Bank.openAccount("Dejan Marlovic");
        Bank.openAccount("Nils Jacobsen");
        Bank.accounts.getFirst().deposit(3999);
        Bank.accounts.get(1).deposit(5533);
        Bank.accounts.get(1).withdrawal(3000);

        Bank.printAccountInfo();

    }
}