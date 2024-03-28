import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal n = sc.nextBigDecimal();
        BigDecimal d = sc.nextBigDecimal();
        BigDecimal x = sc.nextBigDecimal();
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i1 = new BigDecimal(i);
            BigDecimal i2 = new BigDecimal(n.intValue() - i + 1);
            BigDecimal i3 = new BigDecimal(n.intValue() * 2 - 1);
            ans = ans.add(i2.divide(i1, 200, BigDecimal.ROUND_HALF_UP).multiply(d.add(x.multiply(i3.divide(new BigDecimal("2"), 200, BigDecimal.ROUND_HALF_UP)))));
        }
        System.out.println(ans);
    }
}