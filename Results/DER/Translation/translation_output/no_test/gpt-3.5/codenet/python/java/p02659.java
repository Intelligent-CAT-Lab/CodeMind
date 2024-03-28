```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static final int MOD = (int) Math.pow(10, 9) + 7;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String A = input[0];
        String B = input[1];

        BigDecimal decimalA = new BigDecimal(A);
        BigDecimal decimalB = new BigDecimal(B);

        System.out.println(decimalA.multiply(decimalB).toBigInteger());
    }
}
```

