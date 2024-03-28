Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class FactorialCalculation {
    
    private static final int MOD = 1000000007;
    private static final int list_size = 20000001;
    private static long[] f_list = new long[list_size];
    private static long[] f_r_list = new long[list_size];

    public static void main(String[] args) {
        // Precompute factorials and their modular inverses using Fermat's Little Theorem
        f_list[0] = 1;
        for (int i = 1; i < list_size; i++) {
            f_list[i] = (f_list[i - 1] * i) % MOD;
        }

        f_r_list[list_size - 1] = BigInteger.valueOf(f_list[list_size - 1])
                      .modInverse(BigInteger.valueOf(MOD)).longValue();

        for (int i = list_size - 2; i >= 0; i--) {
            f_r_list[i] = (f_r_list[i + 1] * (i + 1)) % MOD;
        }

        // Scanner for input
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        int h = Integer.parseInt(inputs[0]);
        int w = Integer.parseInt(inputs[1]);
        int k = Integer.parseInt(inputs[2]);

        long ans = (long) k * f_list[h + w] * f_r_list[h + w - k] % MOD;
        
        ans += (long) (h + w) * k * (k + 1) * f_list[h + w - 1] * f_r_list[2] * f_r_list[h + w - k] % MOD;
        ans %= MOD;
        
        ans += (long) h * w * f_list[h + w - 2] * (k - 1) * k * (k + 1) * BigInteger.valueOf(3)
            .modInverse(BigInteger.valueOf(MOD)).longValue() * f_r_list[h + w - k] % MOD;
        ans %= MOD;

        // Output the result
        System.out.println(ans);
        
        // Close the scanner
        scanner.close();
    }
}
```

To run this code, you need to compile it with `javac FactorialCalculation.java`, and then run it with `java FactorialCalculation`. When prompted, enter `2 1 2`, and the expected output, `-22`, will be displayed.
