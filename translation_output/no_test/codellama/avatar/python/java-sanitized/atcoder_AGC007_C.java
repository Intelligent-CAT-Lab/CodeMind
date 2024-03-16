import java.math.BigDecimal;
import java.math.MathContext;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        BigDecimal n = new BigDecimal(args[0]);
        BigDecimal d = new BigDecimal(args[1]);
        BigDecimal x = new BigDecimal(args[2]);

        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i = new BigDecimal(i);
            ans = ans.add(new BigDecimal(n.subtract(i).add(1)).divide(i, MathContext.DECIMAL128).multiply(d.add(x.multiply(new BigDecimal(n.multiply(2).subtract(1)).divide(new BigDecimal("2"), MathContext.DECIMAL128)))));
        }
        System.out.println(ans);
    }
}