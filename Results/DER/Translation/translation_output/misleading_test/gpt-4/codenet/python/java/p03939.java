Below is the translated Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        double d = Double.parseDouble(st.nextToken());
        double x = Double.parseDouble(st.nextToken());

        System.out.println(calculate(N, d, x));
    }

    private static double calculate(int N, double d, double x) {
        double ret = 0;
        while (N > 0) {
            ret += d + (N - 0.5) * x;
            d = d + (d / N) + (5 * x) / (2 * N);
            x += 2 * x / N;
            N -= 1;
        }
        return ret;
    }
}
```

Please note that Java doesn't automatically read from stdin so the wrapper class `BufferedReader` and `StringTokenizer` for parsing the inputs are used in the Java solution, unlike Python which directly reads from stdin. The `calculate` method in the Java code is equivalent to the `main` function in the Python code.
