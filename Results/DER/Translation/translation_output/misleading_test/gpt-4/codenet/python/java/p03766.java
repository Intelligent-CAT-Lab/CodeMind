Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    public static final int M = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(1);
        } else {
            long[] res_v = new long[n + 1];
            long[] res_v_cumsum = new long[n + 1];
            res_v[0] = 0;
            res_v[1] = 1;
            res_v[2] = 1;
            res_v_cumsum[0] = 0;
            res_v_cumsum[1] = 1;
            res_v_cumsum[2] = 2;

            for (int k = 3; k < n; k++) {
                res_v[k] = (1 + res_v_cumsum[k - 1] - res_v[k - 2] + M) % M;
                res_v_cumsum[k] = (res_v_cumsum[k - 1] + res_v[k]) % M;
            }

            long result = (((res_v_cumsum[n - 2] * (((long) (n - 1) * (n - 1)) % M)) % M)
                    + ((res_v_cumsum[n - 1] * (n - 1)) % M) + n + ((long) (n - 1) * (n - 1)) % M) % M;

            System.out.println(result);
        }
    }
}
```

The Java version requires defining the array sizes beforehand, and arithmetic operations should be handled carefully to avoid integer overflow, which is why the modulus operations are frequently applied. Additionally, the "long" data type is used to ensure that large numbers are correctly represented. 

Input/output is handled with a `Scanner` for reading from the console, and `System.out.println` is used to output the results to the console.
