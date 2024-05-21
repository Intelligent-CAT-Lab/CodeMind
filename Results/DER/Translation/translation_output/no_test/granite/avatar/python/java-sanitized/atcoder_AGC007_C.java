import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal x = scanner.nextBigDecimal();
        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal two = BigDecimal.valueOf(2);
        BigDecimal one = BigDecimal.ONE;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal iBigDecimal = BigDecimal.valueOf(i);
            BigDecimal numerator = BigDecimal.valueOf(n.intValue() - i + 1);
            BigDecimal denominator = iBigDecimal;
            BigDecimal term = numerator.divide(denominator, 200, BigDecimal.ROUND_HALF_UP);
            BigDecimal factor = (d.add(x.multiply(n.multiply(two).subtract(one)).divide(two, 200, BigDecimal.ROUND_HALF_UP)));
            ans = ans.add(term.multiply(factor));
        }
        System.out.println(ans);
    }
}