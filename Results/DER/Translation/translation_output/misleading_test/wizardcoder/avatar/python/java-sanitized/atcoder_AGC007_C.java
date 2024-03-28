import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class atcoder_AGC007_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MathContext mc = new MathContext(200);
        BigDecimal n = new BigDecimal(sc.next());
        BigDecimal d = new BigDecimal(sc.next());
        BigDecimal x = new BigDecimal(sc.next());
        BigDecimal ans = BigDecimal.ZERO;
        for (int i = 1; i <= n.intValue(); i++) {
            BigDecimal i_dec = new BigDecimal(i);
            ans = ans.add(new BigDecimal(n.subtract(i_dec).add(BigDecimal.ONE).toString()).divide(i_dec, mc)
                   .multiply(d.add(x.multiply(new BigDecimal(n.multiply(BigDecimal.valueOf(2)).subtract(BigDecimal.ONE)).divide(BigDecimal.valueOf(2), mc)))))
                   .round(mc);
        }
        System.out.println(ans);
    }
}