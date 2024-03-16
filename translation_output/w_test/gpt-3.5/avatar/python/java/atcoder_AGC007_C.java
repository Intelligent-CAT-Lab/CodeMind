```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal n = scanner.nextBigDecimal();
        BigDecimal d = scanner.nextBigDecimal();
        BigDecimal x = scanner.nextBigDecimal();

        BigDecimal ans = BigDecimal.ZERO;
        BigDecimal two = new BigDecimal("2");

        for (BigDecimal i = BigDecimal.ONE; i.compareTo(n) <= 0; i = i.add(BigDecimal.ONE)) {
            BigDecimal numerator = n.subtract(i).add(BigDecimal.ONE);
            BigDecimal denominator = i;
            BigDecimal temp = d.add(x.multiply(n.multiply(two).subtract(BigDecimal.ONE)).divide(two));

            ans = ans.add(numerator.divide(denominator, 200, BigDecimal.ROUND_HALF_UP).multiply(temp));
        }

        System.out.println(ans.toPlainString());
    }
}
```

