```java
import java.util.Scanner;
import java.util.Fraction;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        double s = 0;
        double d = 0;
        if (N >= K) {
            s = s + Fraction.getReducedFraction(N - K, N).doubleValue();
            for (int i = 0; i < K; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, Math.ceil(a)) * Fraction.getReducedFraction(1, N).doubleValue();
            }
        } else {
            for (int i = 0; i < N; i++) {
                double a = Math.log(K / (i + 1)) / Math.log(2);
                d = d + Math.pow(0.5, Math.ceil(a)) * Fraction.getReducedFraction(1, N).doubleValue();
            }
        }
        System.out.println(s + d);
    }
}
```
