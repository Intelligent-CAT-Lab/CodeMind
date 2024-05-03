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
        BigDecimal ans = new BigDecimal("0");
        BigDecimal two = new BigDecimal("2");
        BigDecimal twoNMinusOne = n.multiply(new BigDecimal("2")).subtract(new BigDecimal("1"));
        for (BigDecimal i = new BigDecimal("1"); i.compareTo(n.add(new BigDecimal("1"))) < 0; i = i.add(new BigDecimal("1"))) {
            ans = ans.add(n.subtract(i).add(new BigDecimal("1")).divide(i, 200, RoundingMode.HALF_UP).multiply(d.add(x.multiply(twoNMinusOne).divide(two, 200, RoundingMode.HALF_UP))));
        }
        System.out.println(ans);
    }
}
```

Please note that the precision of BigDecimal in Java is limited to 16 digits, so you may need to adjust the precision value (200 in this case) to match your needs.
