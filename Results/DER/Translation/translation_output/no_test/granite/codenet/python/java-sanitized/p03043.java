import java.util.*;
import java.math.BigInteger;
import java.math.BigDecimal;

public class p03043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        BigDecimal d = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(BigDecimal.valueOf(N - K).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            for (int i = 0; i < K; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1.0)) / Math.log(2)).setScale(0, BigDecimal.ROUND_CEILING);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            }
        } else {
            for (int i = 0; i < N; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1.0)) / Math.log(2)).setScale(0, BigDecimal.ROUND_CEILING);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).divide(BigDecimal.valueOf(N), 10, BigDecimal.ROUND_HALF_UP));
            }
        }
        System.out.println(s.add(d).doubleValue());
    }
}