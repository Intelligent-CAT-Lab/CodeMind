```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        BigDecimal A = sc.nextBigDecimal();
        BigDecimal B = sc.nextBigDecimal();
        BigDecimal result = A.multiply(B).setScale(0, RoundingMode.DOWN);
        System.out.println(result);
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        BigDecimal nextBigDecimal() {
            return new BigDecimal(next());
        }
    }
}
```

