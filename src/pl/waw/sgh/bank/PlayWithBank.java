package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.BankException;
import pl.waw.sgh.bank.exceptions.InvalidAmountException;
import pl.waw.sgh.bank.exceptions.NonExistantAccountException;

public class PlayWithBank {

    public static void main(String[] args) throws InvalidAmountException {
        Bank bank = new Bank();
        Customer c1 = bank.createCustomer("Anne","Brown","anne@brown.com");
        Customer c2 = bank.createCustomer("John","Smith","john@smith.com");

        Account acc1 = bank.createAccount(c1, false);
        Account acc2 = bank.createAccount(c1, true);
        Account acc3 = bank.createAccount(c2, false);
        Account acc4 = bank.createAccount(c2, true);

        acc1.deposit(100);

        Bank bank2 = null;
        try {
            bank2.transfer(0, 1, 170);

            //throw new RuntimeException("agaga");
            bank.transfer(0, 1, 170);
            System.out.println(bank);
        } catch (BankException e) {
            System.out.println(e.getMessage());
        }
/*
3. Catch All - only recommended in specific cases
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
*/

/*
2. One clause for many Exception
   } catch (InvalidAmountException | NonExistantAccountException e) {
        System.out.println(e.getMessage());
    }
    */

/*
1. Option - many catch clauses

        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } catch (NonExistantAccountException e) {
            System.out.println(e.getMessage());
        }
*/







    }
}
