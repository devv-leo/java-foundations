package week2.weekendSnacks.bankApp.exceptions;

public class InvalidAccountNumberException extends BankException {
    public InvalidAccountNumberException(String message) {
        super(message);
    }
}
