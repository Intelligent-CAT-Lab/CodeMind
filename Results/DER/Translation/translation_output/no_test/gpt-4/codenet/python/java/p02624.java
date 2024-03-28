Here is the equivalent Java code for the provided Python code:

```java
import java.util.Scanner;

public class DSumOfDivisors {

    public void solve(int tc) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long sum = 0;
        for (int k = 1; k <= n; k++) {
            sum += k / 2L * (n / k) * (1 + n / k);
        }

        System.out.println(sum);
        scanner.close();
    }

    // The following commented method divCount is not directly converted as it is not used in the solve method
    /*
    private int divCount(int n) {
        int[] hh = new int[n + 1];
        java.util.Arrays.fill(hh, 1);
        int p = 2;
        while (p * p < n) {
            if (hh[p] == 1) {
                for (int i = p * 2; i < n; i += p) {
                    hh[i] = 0;
                }
            }
            p++;
        }

        int total = 1;
        for (p = 2; p <= n; p++) {
            if (hh[p] == 1) {
                int count = 0;
                while (n % p == 0) {
                    n = n / p;
                    count++;
                }
                total *= (count + 1);
            }
        }

        return total;
    }
    */

    public static void main(String[] args) {
        new DSumOfDivisors().solve(0);
    }
}
```

Please note that the commented `divCount` method is not used in the `solve` method; therefore, I have omitted its conversion to Java. If `divCount` is required, it can be translated and uncommented in the Java code.

Additionally, it is important to notice that the `Scanner` class is used for input in the Java code, replacing the Python `input()` function. Also, the `print` function is converted to `System.out.println` in Java for output. The `sum` calculation is directly converted, but care is taken with data types, using `long` to avoid overflow issues with larger numbers.
