import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

public class CurrencyConverterTest {

    @Test
    public void testConvert() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(100.00);
        BigDecimal rate = BigDecimal.valueOf(2.70);
        BigDecimal expectedAmount = BigDecimal.valueOf(270.00).setScale(2);
        BigDecimal actualAmount = converter.convert(originalAmount, rate);
        assertEquals(expectedAmount, actualAmount);
    }
    
    @Test
    public void testConvertWithRounding() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal originalAmount = BigDecimal.valueOf(99.99);
        BigDecimal rate = BigDecimal.valueOf(0.055);
        BigDecimal expectedAmount = BigDecimal.valueOf(5.50).setScale(2);
        BigDecimal actualAmount = converter.convert(originalAmount, rate);
        assertEquals(expectedAmount, actualAmount);
    }
    
    @Test
    public void testIsValid() {
        CurrencyConverter converter = new CurrencyConverter();
        BigDecimal rate = BigDecimal.valueOf(0.055);
        assertTrue(converter.isValid(rate));
    }

    @Test
    public void testIsValidWhenRateIsNull() {
        CurrencyConverter converter = new CurrencyConverter();     
        assertFalse(converter.isValid(null));
    }
    
}






