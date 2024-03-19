import java.util.Scanner;
import java.math.BigDecimal;
import java.math.MathContext;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        if (N >= K) {
            s = s.add(BigDecimal.valueOf(N - K).divide(BigDecimal.valueOf(N), MathContext.DECIMAL128));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                BigDecimal a = BigDecimal.log(BigDecimal.valueOf(K).divide(BigDecimal.valueOf(i + 1), MathContext.DECIMAL128), 2);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2), MathContext.DECIMAL128).pow(BigDecimal.ceil(a), MathContext.DECIMAL128).multiply(BigDecimal.ONE.divide(BigDecimal.valueOf(N), MathContext.DECIMAL128)));
            }
        } else {
            d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                BigDecimal a = BigDecimal.log(BigDecimal.valueOf(K).divide(BigDecimal.valueOf(i + 1), MathContext.DECIMAL128), 2);
                d = d.add(BigDecimal.ONE.divide(BigDecimal.valueOf(2), MathContext.DECIMAL128).pow(BigDecimal.ceil(a), MathContext.DECIMAL128).multiply(BigDecimal.ONE.divide(BigDecimal.valueOf(N), MathContext.DECIMAL128)));
            }
        }
        System.out.println(s.add(d).toPlainString());
    }
}