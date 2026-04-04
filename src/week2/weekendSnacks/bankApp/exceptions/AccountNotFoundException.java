package week2.weekendSnacks.bankApp.exceptions;

public class AccountNotFoundException  extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
