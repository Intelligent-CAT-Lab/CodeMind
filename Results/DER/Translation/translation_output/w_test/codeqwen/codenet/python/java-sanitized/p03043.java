import java.math.BigDecimal;
import java.math.RoundingMode;

public class p03043 {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        BigDecimal s = new BigDecimal(0);
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP));
            int d = 0;
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d += Math.pow(2, Math.ceil(a)) / Math.pow(2, K);
            }
            s = s.add(new BigDecimal(d).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP));
        } else {
            int d = 0;
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d += Math.pow(2, Math.ceil(a)) / Math.pow(2, N);
            }
            s = s.add(new BigDecimal(d).divide(new BigDecimal(N), 15, RoundingMode.HALF_UP));
        }
        System.out.println(s.doubleValue());
    }
}