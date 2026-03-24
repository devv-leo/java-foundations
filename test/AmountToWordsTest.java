import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountToWordsTest {
    
    @Test
    public void testConvertAmountToWords_Zero() {
        assertEquals("zero", day4.AmountToWords.convertAmountToWords(0));
    }
    
    @Test
    public void testConvertAmountToWords_SingleDigits() {
        assertEquals("one", day4.AmountToWords.convertAmountToWords(1));
        assertEquals("five", day4.AmountToWords.convertAmountToWords(5));
        assertEquals("nine", day4.AmountToWords.convertAmountToWords(9));
    }
    
    @Test
    public void testConvertAmountToWords_Teens() {
        assertEquals("eleven", day4.AmountToWords.convertAmountToWords(11));
        assertEquals("fifteen", day4.AmountToWords.convertAmountToWords(15));
        assertEquals("nineteen", day4.AmountToWords.convertAmountToWords(19));
    }
    
    @Test
    public void testConvertAmountToWords_Tens() {
        assertEquals("twenty", day4.AmountToWords.convertAmountToWords(20));
        assertEquals("thirty", day4.AmountToWords.convertAmountToWords(30));
        assertEquals("fifty", day4.AmountToWords.convertAmountToWords(50));
        assertEquals("ninety", day4.AmountToWords.convertAmountToWords(90));
    }
    
    @Test
    public void testConvertAmountToWords_TwoDigits() {
        assertEquals("twenty three", day4.AmountToWords.convertAmountToWords(23));
        assertEquals("forty seven", day4.AmountToWords.convertAmountToWords(47));
        assertEquals("sixty nine", day4.AmountToWords.convertAmountToWords(69));
    }
    
    @Test
    public void testConvertAmountToWords_Hundreds() {
        assertEquals("one hundred", day4.AmountToWords.convertAmountToWords(100));
        assertEquals("two hundred fifty", day4.AmountToWords.convertAmountToWords(250));
        assertEquals("nine hundred ninety nine", day4.AmountToWords.convertAmountToWords(999));
    }
    
    @Test
    public void testConvertAmountToWords_Thousands() {
        assertEquals("one thousand", day4.AmountToWords.convertAmountToWords(1000));
        assertEquals("two thousand five hundred", day4.AmountToWords.convertAmountToWords(2500));
        assertEquals("five thousand", day4.AmountToWords.convertAmountToWords(5000));
    }
    
    @Test
    public void testConvertAmountToWords_ComplexNumbers() {
        assertEquals("one thousand two hundred thirty four", day4.AmountToWords.convertAmountToWords(1234));
        assertEquals("twelve thousand three hundred forty five", day4.AmountToWords.convertAmountToWords(12345));
        assertEquals("one hundred twenty three thousand four hundred fifty six", day4.AmountToWords.convertAmountToWords(123456));
    }
    
    @Test
    public void testConvertAmountToWords_EdgeCases() {
        assertEquals("Amount out of range (0-999999)", day4.AmountToWords.convertAmountToWords(-1));
        assertEquals("Amount out of range (0-999999)", day4.AmountToWords.convertAmountToWords(1000000));
    }
    
    @Test
    public void testFormatCurrencyAmount() {
        assertEquals("zero naira", day4.AmountToWords.formatCurrencyAmount(0));
        assertEquals("fifteen naira", day4.AmountToWords.formatCurrencyAmount(15));
        assertEquals("one hundred twenty five naira", day4.AmountToWords.formatCurrencyAmount(125));
        assertEquals("one thousand two hundred fifty naira", day4.AmountToWords.formatCurrencyAmount(1250));
        assertEquals("fifty thousand naira", day4.AmountToWords.formatCurrencyAmount(50000));
    }
    
    @Test
    public void testFormatCurrencyAmount_EdgeCases() {
        assertEquals("Amount out of range (0-999999) naira", day4.AmountToWords.formatCurrencyAmount(-5));
        assertEquals("Amount out of range (0-999999) naira", day4.AmountToWords.formatCurrencyAmount(1000000));
    }
}
