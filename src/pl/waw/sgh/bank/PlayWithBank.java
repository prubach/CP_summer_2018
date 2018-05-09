package pl.waw.sgh.bank;

public class PlayWithBank {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Customer c1 = bank.createCustomer("Anne","Brown","anne@brown.com");
        Customer c2 = bank.createCustomer("John","Smith","john@smith.com");

        Account acc1 = bank.createAccount(c1, false);
        Account acc2 = bank.createAccount(c1, true);
        Account acc3 = bank.createAccount(c2, false);
        Account acc4 = bank.createAccount(c2, true);

        acc1.deposit(100);

        System.out.println(bank);

    }
}
