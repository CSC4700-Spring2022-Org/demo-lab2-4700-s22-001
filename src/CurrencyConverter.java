import java.math.BigDecimal;
import java.math.RoundingMode;

public class CurrencyConverter {

    public CurrencyConverter() {
    }

    public static void main(String[] args) {
        System.out.println("Hello CurrencyConverter");
    }

    public BigDecimal convert(BigDecimal originalAmount, BigDecimal rate) {
        BigDecimal result = originalAmount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
        return result;
    }

}
