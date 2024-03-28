import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(200);
        BigDecimal n = new BigDecimal(sc.next(), mc);
        BigDecimal d = new BigDecimal(sc.next(), mc);
        BigDecimal x = new BigDecimal(sc.next(), mc);
        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i_dec = new BigDecimal(i);
            ans = ans.add(new BigDecimal((int)(n.intValue() - i + 1))
                   .divide(i_dec, mc)
                   .multiply(d.add(x.multiply(new BigDecimal(int.toString(n.multiply(new BigDecimal("2")).subtract(new BigDecimal("1"))))))
                           .divide(new BigDecimal("2"), mc)));
        }
        System.out.println(ans);
    }
}