import java.math.BigDecimal;
import java.util.Scanner;

public class atcoder_AGC007_C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal n = new BigDecimal(sc.next());
        BigDecimal d = new BigDecimal(sc.next());
        BigDecimal x = new BigDecimal(sc.next());
        BigDecimal ans = new BigDecimal("0");
        for (int i = 1; i <= n.intValue(); i++) {
            ans = ans.add(new BigDecimal(n.subtract(new BigDecimal(i)).add(new BigDecimal("1")).toString()).divide(new BigDecimal(i).toString(), 200, BigDecimal.ROUND_HALF_UP).multiply(d.add(x.multiply(new BigDecimal(n.multiply(new BigDecimal("2")).subtract(new BigDecimal("1"))).toString())).divide(new BigDecimal("2"), 200, BigDecimal.ROUND_HALF_UP)));
        }
        System.out.println(ans);
    }
}