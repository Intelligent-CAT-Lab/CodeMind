import java.util.Scanner;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        BigDecimal d = BigDecimal.ZERO;
        
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP));
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (double)(i + 1)) / Math.log(2);
                d = d.add(BigDecimal.valueOf(Math.pow(0.5, Math.ceil(a)))).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP);
            }
        } else {
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (double)(i + 1)) / Math.log(2);
                d = d.add(BigDecimal.valueOf(Math.pow(0.5, Math.ceil(a)))).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP);
            }
        }
        
        BigDecimal result = s.add(d);
        System.out.println(result.setScale(15, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString());
        
        scanner.close();
    }
}