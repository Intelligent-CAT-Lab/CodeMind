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
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N)));
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < K; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2));
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2)).pow(a.intValue()).multiply(new BigDecimal(1).divide(new BigDecimal(N))));
            }
            System.out.println(s.add(d));
        } else {
            BigDecimal d = BigDecimal.ZERO;
            for (int i = 0; i < N; i++) {
                BigDecimal a = new BigDecimal(Math.log(K / (i + 1))).divide(new BigDecimal(2));
                d = d.add(new BigDecimal(1).divide(new BigDecimal(2)).pow(a.intValue()).multiply(new BigDecimal(1).divide(new BigDecimal(N))));
            }
            System.out.println(d);
        }
    }
}