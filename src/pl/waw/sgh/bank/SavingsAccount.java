package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class SavingsAccount extends Account {

    public SavingsAccount(Integer accountID, BigDecimal balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
