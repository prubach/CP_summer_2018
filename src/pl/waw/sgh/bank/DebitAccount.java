package pl.waw.sgh.bank;

import java.math.BigDecimal;

public class DebitAccount extends Account {

    public DebitAccount(Integer accountID, BigDecimal balance, Customer customer) {
        super(accountID, balance, customer);
    }
}
