import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;

public class p03043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, BigDecimal.ROUND_HALF_UP));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2), 10, BigDecimal.ROUND_HALF_UP);
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(1).divide(new BigDecimal(N), 10, BigDecimal.ROUND_HALF_UP)));
            }
            System.out.println(s.add(d).doubleValue());
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2), 10, BigDecimal.ROUND_HALF_UP);
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2).pow(a.intValue()), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(1).divide(new BigDecimal(N), 10, BigDecimal.ROUND_HALF_UP)));
            }
            System.out.println(d.doubleValue());
        }
    }
}