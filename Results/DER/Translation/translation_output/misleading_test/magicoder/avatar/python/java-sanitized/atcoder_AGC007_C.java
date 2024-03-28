import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = new BigDecimal(scanner.next());
        BigDecimal d = new BigDecimal(scanner.next());
        BigDecimal x = new BigDecimal(scanner.next());
        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(
                    (n.subtract(i).add(BigDecimal.ONE)).divide(i, 200, BigDecimal.ROUND_HALF_UP)
                            .multiply(d.add(x.multiply(n.multiply(new BigDecimal(2)).subtract(BigDecimal.ONE)).divide(new BigDecimal(2), 200, BigDecimal.ROUND_HALF_UP))));
        }
        System.out.println(ans.setScale(200, BigDecimal.ROUND_HALF_UP));
    }
}