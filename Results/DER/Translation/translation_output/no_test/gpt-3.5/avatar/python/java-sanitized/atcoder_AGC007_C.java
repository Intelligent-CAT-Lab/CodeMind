import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int precision = 200;
        BigDecimal n, d, x, ans;
        BigDecimal two = new BigDecimal("2");

        n = new BigDecimal(scanner.next());
        d = new BigDecimal(scanner.next());
        x = new BigDecimal(scanner.next());

        ans = BigDecimal.ZERO;

        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal currentI = new BigDecimal(i);
            BigDecimal numerator = n.subtract(currentI).add(BigDecimal.ONE);
            BigDecimal denominator = currentI;
            BigDecimal temp = d.add(x.multiply(n.multiply(two).subtract(BigDecimal.ONE)).divide(two));

            ans = ans.add(numerator.divide(denominator, precision, BigDecimal.ROUND_HALF_UP).multiply(temp));
        }

        System.out.println(ans);
    }
}