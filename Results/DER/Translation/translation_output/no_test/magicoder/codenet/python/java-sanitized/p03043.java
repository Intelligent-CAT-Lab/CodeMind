import java.util.Scanner;
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
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i +