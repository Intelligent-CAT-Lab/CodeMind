import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.Scanner;
import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.valueOf;

public class p03043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = BigDecimal.ZERO;
        BigDecimal d = BigDecimal.ZERO;
		
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(valueOf(N), MathContext.DECIMAL128));
        }
        
        for (int i = 0; i < (N >= K ? K : N); i++) {
            double a = Math.log(K / (double)(i + 1)) / Math.log(2);
            d = d.add(ONE.divide(valueOf(2).pow((int)Math.ceil(a)), MathContext.DECIMAL128).multiply(ONE.divide(valueOf(N), MathContext.DECIMAL128)));
        }

        System.out.println(s.add(d, MathContext.DECIMAL128).doubleValue());
        scanner.close();
    }
}