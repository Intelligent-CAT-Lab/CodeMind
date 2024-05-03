Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        BigDecimal s = new BigDecimal(0);
        if (N >= K) {
            s = s.add(new BigDecimal(N - K).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < K; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(BigDecimal.valueOf(Math.pow(2, Math.ceil(a.doubleValue()))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(s.add(d).doubleValue());
        } else {
            BigDecimal d = new BigDecimal(0);
            for (int i = 0; i < N; i++) {
                BigDecimal a = BigDecimal.valueOf(Math.log(K / (i + 1)) / Math.log(2));
                d = d.add(BigDecimal.valueOf(Math.pow(2, Math.ceil(a.doubleValue()))).divide(new BigDecimal(N), 10, RoundingMode.HALF_UP));
            }
            System.out.println(s.add(d).doubleValue());
        }
    }
}
```

Please note that the `Fraction` class in Java does not exist, so I used `BigDecimal` instead. Also, the `math.log` function in Java returns a double value, so I used `Math.log(K / (i + 
