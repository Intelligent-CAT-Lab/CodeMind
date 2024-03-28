import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class p03043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), MathContext.DECIMAL128));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(2, Math.ceil(a))).divide(new BigDecimal(N), MathContext.DECIMAL128));
            }
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d.add(new BigDecimal(Math.pow(2, Math.ceil(a))).divide(new BigDecimal(N), MathContext.DECIMAL128));
            }
        }
        System.out.println(s.add(d).doubleValue());
    }
}