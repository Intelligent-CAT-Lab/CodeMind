Here is the Java version of your Python code:

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
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
```

This Java code does the same thing as your Python code. It reads two integers from the console, calculates the values of `s` and `d`, and then prints the sum of `s` and `d`. The `BigDecimal` class is used to handle the precision of the floating point numbers. The `RoundingMode.HALF_UP` argument is used to round the result to the nearest number with equal
