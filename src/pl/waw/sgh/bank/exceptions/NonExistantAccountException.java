package pl.waw.sgh.bank.exceptions;

public class NonExistantAccountException extends BankException {
    public NonExistantAccountException(String s) {
        super(s);
    }
}
