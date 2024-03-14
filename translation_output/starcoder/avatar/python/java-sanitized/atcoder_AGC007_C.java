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
            ans = ans.add(new BigDecimal(String.valueOf((n.intValue() - i + 1) * d.intValue() / i)).multiply(x.multiply(new BigDecimal(String.valueOf(n.intValue() * 2 - 1))).divide(new BigDecimal("2"))));
        }
        System.out.println(ans);
    }
}