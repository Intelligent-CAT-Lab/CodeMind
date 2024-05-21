import java.math.BigDecimal;
import java.math.RoundingMode;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        BigDecimal n = new BigDecimal(input[0]);
        BigDecimal d = new BigDecimal(input[1]);
        BigDecimal x = new BigDecimal(input[2]);
        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n.add(BigDecimal.ONE)) < 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(n.subtract(i).add(BigDecimal.ONE).divide(i, 200, RoundingMode.HALF_UP).multiply(d.add(x.multiply(n.multiply(BigDecimal.valueOf(2)).subtract(BigDecimal.ONE)).divide(BigDecimal.valueOf(2), 200, RoundingMode.HALF_UP))));
        }
        System.out.println(ans);
    }
}