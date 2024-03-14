import java.util.Scanner;
import java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = new BigDecimal(0);
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < K; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(new BigDecimal(Math.pow(0.5, a.toBigInteger().add(BigInteger.ONE).intValue())).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(s.add(d).setScale(10, RoundingMode.HALF_UP).toString());
        } else {
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < N; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(new BigDecimal(Math.pow(0.5, a.toBigInteger().add(BigInteger.ONE).intValue())).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(d.setScale(10, RoundingMode.HALF_UP).toString());
        }
    }
}