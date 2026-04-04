import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import week1.weekendSnacks.arrays.CreditCardValidator;

public class CreditCardValidatorTest {

    @Test
    public void testGetCardTypeVisa() {
        assertEquals("Visa", CreditCardValidator.getCardType("4388576018402626"));
        assertEquals("Visa", CreditCardValidator.getCardType("4111111111111111"));
        assertEquals("Visa", CreditCardValidator.getCardType("4123456789012"));
    }

    @Test
    public void testGetCardTypeMasterCard() {
        assertEquals("MasterCard", CreditCardValidator.getCardType("5399831619690403"));
        assertEquals("MasterCard", CreditCardValidator.getCardType("5105105105105100"));
        assertEquals("MasterCard", CreditCardValidator.getCardType("5555555555554444"));
    }

    @Test
    public void testGetCardTypeAmericanExpress() {
        assertEquals("American Express", CreditCardValidator.getCardType("378282246310005"));
        assertEquals("American Express", CreditCardValidator.getCardType("371449635398431"));
    }

    @Test
    public void testGetCardTypeDiscover() {
        assertEquals("Discover", CreditCardValidator.getCardType("6011111111111117"));
        assertEquals("Discover", CreditCardValidator.getCardType("6512345678901234"));
        assertEquals("Discover", CreditCardValidator.getCardType("6221261234567890"));
    }

    @Test
    public void testGetCardTypeInvalid() {
        assertEquals("Invalid", CreditCardValidator.getCardType("1234567890123456"));
        assertEquals("Invalid", CreditCardValidator.getCardType("9876543210987654"));
        assertEquals("Invalid", CreditCardValidator.getCardType("0000000000000000"));
    }

    @Test
    public void testIsValidLengthVisa() {
        assertTrue(CreditCardValidator.isValidLength("4388576018402626", "Visa"));
        assertTrue(CreditCardValidator.isValidLength("4123456789012", "Visa"));
        assertFalse(CreditCardValidator.isValidLength("41234567890", "Visa"));
        assertFalse(CreditCardValidator.isValidLength("41234567890123456", "Visa"));
    }

    @Test
    public void testIsValidLengthMasterCard() {
        assertTrue(CreditCardValidator.isValidLength("5399831619690403", "MasterCard"));
        assertFalse(CreditCardValidator.isValidLength("539983161969040", "MasterCard"));
        assertFalse(CreditCardValidator.isValidLength("53998316196904034", "MasterCard"));
    }

    @Test
    public void testIsValidLengthAmericanExpress() {
        assertTrue(CreditCardValidator.isValidLength("378282246310005", "American Express"));
        assertFalse(CreditCardValidator.isValidLength("37828224631000", "American Express"));
        assertFalse(CreditCardValidator.isValidLength("3782822463100056", "American Express"));
    }

    @Test
    public void testIsValidLengthDiscover() {
        assertTrue(CreditCardValidator.isValidLength("6011111111111117", "Discover"));
        assertFalse(CreditCardValidator.isValidLength("601111111111111", "Discover"));
        assertFalse(CreditCardValidator.isValidLength("60111111111111178", "Discover"));
    }

    @Test
    public void testIsValidLuhnValidCards() {
        assertTrue(CreditCardValidator.isValidLuhn("4532015112830366"));
        assertTrue(CreditCardValidator.isValidLuhn("6011111111111117"));
        assertTrue(CreditCardValidator.isValidLuhn("371449635398431"));
        assertTrue(CreditCardValidator.isValidLuhn("5555555555554444"));
    }

    @Test
    public void testIsValidLuhnInvalidCards() {
        assertFalse(CreditCardValidator.isValidLuhn("4532015112830367"));
        assertFalse(CreditCardValidator.isValidLuhn("6011111111111118"));
        assertFalse(CreditCardValidator.isValidLuhn("371449635398432"));
        assertFalse(CreditCardValidator.isValidLuhn("5555555555554445"));
    }

}
