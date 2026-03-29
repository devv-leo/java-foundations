package day7.weekendSnacks2.bankApp.exceptions;

public class AccountNotFoundException  extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
