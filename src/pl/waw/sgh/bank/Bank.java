package pl.waw.sgh.bank;

import pl.waw.sgh.bank.exceptions.InvalidAmountException;
import pl.waw.sgh.bank.exceptions.NonExistantAccountException;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Bank {

    List<Customer> custList = new ArrayList<>();

    List<Account> accList = new ArrayList<>();

    private Integer lastCustID = 0;

    private Integer lastAccID = 0;

    public List<Account> getAccList() {
        return accList;
    }

    public List<Customer> getCustList() {
        return custList;
    }

    public Integer getLastAccID() {
        return lastAccID;
    }

    public Integer getLastCustID() {
        return lastCustID;
    }

    public Customer createCustomer(String firstName,
                                   String lastName,
                                   String email) {
        Customer customer = new Customer(lastCustID++,firstName, lastName, email);
        custList.add(customer);
        return customer;
    }

    public void deleteCustomer(Integer custId) {
        Customer custToDel = findCustomerById(custId);
        //TODO First find all accounts that belong to that customer and delete them
        custList.remove(custToDel);
    }

    public void deleteAccount(Integer accId) throws NonExistantAccountException {
        Account acc = findAccountById(accId);
        accList.remove(acc);
    }

    public void deleteCustomerAndHisHersAccounts(Integer custId) {
        Customer cust = findCustomerById(custId);
        List<Account> custAccs = findAccountsByCustomer(cust);
        for (Account acc : custAccs) {
            try {
                deleteAccount(acc.getAccountID());
            } catch (NonExistantAccountException ne) {
                System.out.println(ne.getMessage());
            }
        }
        deleteCustomer(custId);
    }


    public Account createAccount(Customer customer, boolean isSavings) {
        Account account = (isSavings ?
                            new SavingsAccount(lastAccID++, new BigDecimal(0), customer)
                            :
                            new DebitAccount(lastAccID++, new BigDecimal(0), customer)
        );
        accList.add(account);
        return account;
    }

    public void transfer(Integer fromAccId, Integer toAccId, double amount)
            throws InvalidAmountException, NonExistantAccountException {
        Account fromAcc = findAccountById(fromAccId);
        Account toAcc = findAccountById(toAccId);
        fromAcc.charge(amount);
        toAcc.deposit(amount);
    }
/*

    public void transfer(Integer fromAccId, Integer toAccId, double amount) {
        Account fromAcc = findAccountById(fromAccId);
        Account toAcc = findAccountById(toAccId);
        int res = fromAcc.charge(amount);
        if (res<0) {
            System.out.println("Not enough money");
            System.exit(res);
        }
        toAcc.deposit(amount);
    }
*/

    public Account findAccountById(int id) throws NonExistantAccountException {
        // iterate through the account list and return the account with a given id
        for (Account acc : accList) {
            //if (id.equals(acc.getAccountID()))
            if (id==acc.getAccountID())
                return acc;
        }
        throw new NonExistantAccountException("Account id: " + id + " does not exist!");
        //return null;
    }

    public List<Account> findAccountsByCustomer(Customer customer) {

        List<Account> custAccs = new ArrayList<>();
        // iterate through the account list and return the account with a given id
        for (Account acc : accList) {
            //if (id.equals(acc.getAccountID()))
            if (acc.getCustomer().equals(customer))
                custAccs.add(acc);
        }
        return custAccs;
        //return null;
    }

    public Customer findCustomerById(int id) {
        for (Customer cust : custList) {
            if (id==cust.getCustomerID())
                return cust;
        }
        return null;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "cust=" + custList +
                "\nacc=" + accList +
                '}';
    }
}
