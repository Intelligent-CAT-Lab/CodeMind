Here is the updated Java code equivalent to the provided Python code:

```java
import java.util.Scanner;

public class DynamicProgrammingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();
        
        int mod = 1000000007;
        
        int[][][] dp = new int[2][n + 1][n + 1];
        dp[0][1][1] = 1;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= n; j++) {
                for (int k = 0; k <= n; k++) {
                    dp[(i + 1) % 2][j][k] = 0;
                }
            }

            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= j; k++) {
                    dp[(i + 1) % 2][Math.min(j + 1, n)][k] = (dp[(i + 1) % 2][Math.min(j + 1, n)][k] + (int)(((long)dp[i % 2][j][k] * (n - j)) % mod)) % mod;
                    dp[(i + 1) % 2][j][k] = (dp[(i + 1) % 2][j][k] + (int)(((long)dp[i % 2][j][k] * (j - k)) % mod)) % mod;
                    dp[(i + 1) % 2][j][j] = (dp[(i + 1) % 2][j][j] + (int)(((long)dp[i % 2][j][k] * k) % mod)) % mod;
                }
            }
        }
        
        System.out.println(dp[m % 2][n][n] % mod);
    }
}
``` 

Please note the following changes made to adapt the Python code to Java:
 
1. Declaring and initializing variables with type information, such as `int n` and `int m`.
2. Using `Scanner` for input since Java does not have a built-in function equivalent to Python's `raw_input`.
3. Explicit type casting to ensure proper overflow handling and modulo operation.
4. Usage of `Math.min()` for the minimum calculation as there is no direct equivalent of Python's `min` function.
5. Adding printing statements to output the final result.
