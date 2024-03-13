import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = new BigDecimal(scanner.next());
        BigDecimal d = new BigDecimal(scanner.next());
        BigDecimal x = new BigDecimal(scanner.next());
        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(new BigDecimal(n.subtract(i).add(BigDecimal.ONE).toString()).divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(new BigDecimal(n.multiply(new BigDecimal(2)).subtract(BigDecimal.ONE).toString()).divide(new BigDecimal("2"), 200, BigDecimal.ROUND_HALF_UP)))));
        }
        System.out.println(ans);
    }
}