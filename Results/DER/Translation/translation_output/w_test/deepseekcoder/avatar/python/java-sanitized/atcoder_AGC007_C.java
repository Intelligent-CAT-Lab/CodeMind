import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal x = scanner.nextBigDecimal();

        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal temp = n.subtract(i).add(BigDecimal.ONE);
            ans = ans.add(temp.divide(i, 200, BigDecimal.ROUND_HALF_UP)
                    .multiply(d.add(x.multiply(n.multiply(new BigDecimal("2")).subtract(BigDecimal.ONE)))));
        }
        System.out.println(ans);
    }
}