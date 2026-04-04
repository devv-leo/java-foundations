package week2.weekendSnacks.bankApp.exceptions;

public class InvalidPinException extends BankException {
    public InvalidPinException(String message) {
        super(message);
    }
}
