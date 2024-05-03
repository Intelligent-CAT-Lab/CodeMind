Here is the Java version of your Python code:

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        String[] input = System.console().readLine().split(" ");
        BigDecimal n = new BigDecimal(input[0]);
        BigDecimal d = new BigDecimal(input[1]);
        BigDecimal x = new BigDecimal(input[2]);
        BigDecimal ans = BigDecimal.ZERO;
        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            ans = ans.add(n.subtract(i).add(BigDecimal.ONE).divide(i, 200, RoundingMode.HALF_UP).multiply(d.add(x.multiply(n.multiply(BigDecimal.valueOf(2)).subtract(BigDecimal.ONE)).divide(BigDecimal.valueOf(2), 200, RoundingMode.HALF_UP))));
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads the input from the console, converts it to BigDecimal for precision, and then performs the same calculations as your Python code. The BigDecimal class is used to handle very large and very small floating point numbers, which is necessary for this problem. The RoundingMode.HALF_UP is used to round the result to 200 decimal places.
