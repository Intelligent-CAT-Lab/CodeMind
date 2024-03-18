import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\s+");
        scanner.useLocale(java.util.Locale.US);

        int precision = 200;
        BigDecimal n = new BigDecimal(scanner.next());
        BigDecimal d = new BigDecimal(scanner.next());
        BigDecimal x = new BigDecimal(scanner.next());

        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal currentI = new BigDecimal(String.valueOf(i));
            BigDecimal numerator = new BigDecimal(String.valueOf(n.intValue() - i + 1));
            BigDecimal denominator = new BigDecimal(String.valueOf(i));
            BigDecimal term = numerator.divide(denominator, precision, BigDecimal.ROUND_HALF_UP)
                                .multiply(d.add(x.multiply(new BigDecimal(String.valueOf(n.intValue() * 2 - 1))).divide(new BigDecimal("2"), precision, BigDecimal.ROUND_HALF_UP));
            ans = ans.add(term);
        }
        
        System.out.println(ans);
    }
}