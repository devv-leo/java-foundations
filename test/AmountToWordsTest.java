import org.junit.jupiter.api.Test;

import week2.day1.AmountToWords;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AmountToWordsTest {
    
    @Test
    public void testConvertAmountToWords_Zero() {
        assertEquals("zero", AmountToWords.convertAmountToWords(0));
    }
    
    @Test
    public void testConvertAmountToWords_SingleDigits() {
        assertEquals("one", AmountToWords.convertAmountToWords(1));
        assertEquals("five", AmountToWords.convertAmountToWords(5));
        assertEquals("nine", AmountToWords.convertAmountToWords(9));
    }
    
    @Test
    public void testConvertAmountToWords_Teens() {
        assertEquals("eleven", AmountToWords.convertAmountToWords(11));
        assertEquals("fifteen", AmountToWords.convertAmountToWords(15));
        assertEquals("nineteen", AmountToWords.convertAmountToWords(19));
    }
    
    @Test
    public void testConvertAmountToWords_Tens() {
        assertEquals("twenty", AmountToWords.convertAmountToWords(20));
        assertEquals("thirty", AmountToWords.convertAmountToWords(30));
        assertEquals("fifty", AmountToWords.convertAmountToWords(50));
        assertEquals("ninety", AmountToWords.convertAmountToWords(90));
    }
    
    @Test
    public void testConvertAmountToWords_TwoDigits() {
        assertEquals("twenty three", AmountToWords.convertAmountToWords(23));
        assertEquals("forty seven", AmountToWords.convertAmountToWords(47));
        assertEquals("sixty nine", AmountToWords.convertAmountToWords(69));
    }
    
    @Test
    public void testConvertAmountToWords_Hundreds() {
        assertEquals("one hundred", AmountToWords.convertAmountToWords(100));
        assertEquals("two hundred fifty", AmountToWords.convertAmountToWords(250));
        assertEquals("nine hundred ninety nine", AmountToWords.convertAmountToWords(999));
    }
    
    @Test
    public void testConvertAmountToWords_Thousands() {
        assertEquals("one thousand", AmountToWords.convertAmountToWords(1000));
        assertEquals("two thousand five hundred", AmountToWords.convertAmountToWords(2500));
        assertEquals("five thousand", AmountToWords.convertAmountToWords(5000));
    }
    
    @Test
    public void testConvertAmountToWords_ComplexNumbers() {
        assertEquals("one thousand two hundred thirty four", AmountToWords.convertAmountToWords(1234));
        assertEquals("twelve thousand three hundred forty five", AmountToWords.convertAmountToWords(12345));
        assertEquals("one hundred twenty three thousand four hundred fifty six", AmountToWords.convertAmountToWords(123456));
    }
    
    @Test
    public void testConvertAmountToWords_EdgeCases() {
        assertEquals("Amount out of range (0-999999)", AmountToWords.convertAmountToWords(-1));
        assertEquals("Amount out of range (0-999999)", AmountToWords.convertAmountToWords(1000000));
    }
    
    @Test
    public void testFormatCurrencyAmount() {
        assertEquals("zero naira", AmountToWords.formatCurrencyAmount(0));
        assertEquals("fifteen naira", AmountToWords.formatCurrencyAmount(15));
        assertEquals("one hundred twenty five naira", AmountToWords.formatCurrencyAmount(125));
        assertEquals("one thousand two hundred fifty naira", AmountToWords.formatCurrencyAmount(1250));
        assertEquals("fifty thousand naira", AmountToWords.formatCurrencyAmount(50000));
    }
    
    @Test
    public void testFormatCurrencyAmount_EdgeCases() {
        assertEquals("Amount out of range (0-999999) naira", AmountToWords.formatCurrencyAmount(-5));
        assertEquals("Amount out of range (0-999999) naira", AmountToWords.formatCurrencyAmount(1000000));
    }
}
