import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal x = scanner.nextBigDecimal();
        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal iBigDecimal = new BigDecimal(String.valueOf(i));
            ans = ans.add(new BigDecimal(String.valueOf(n.intValue() - i + 1)).divide(iBigDecimal, MathContext.DECIMAL128).multiply(d.add(x.multiply(new BigDecimal(String.valueOf(n.intValue() * 2 - 1)).divide(new BigDecimal("2"), MathContext.DECIMAL128)))));
        }
        System.out.println(ans);
    }
}