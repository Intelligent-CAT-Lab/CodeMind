<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3

Expected output:
147


```
mod = 10 ** 9 + 7
n , k = map ( int , input ( ) . split ( ) )
coef = [ ]
for i in range ( 1 , int ( n ** 0.5 ) + 1 ) :
    coef . append ( ( n // i ) - ( n // ( i + 1 ) ) )
coef += [ 1 ] * ( n - sum ( coef ) )
coef = coef [ : : - 1 ]
nn = len ( coef )
dp = [ [ 0 ] * nn for _ in range ( k + 1 ) ]
dp [ 0 ] [ 0 ] = 1
for i in range ( 1 , k + 1 ) :
    tmp = 0
    for j in range ( nn - 1 , - 1 , - 1 ) :
        tmp += dp [ i - 1 ] [ ( nn - 1 ) - j ]
        tmp %= mod
        dp [ i ] [ j ] = coef [ j ] * tmp
        dp [ i ] [ j ] %= mod
print ( sum ( dp [ k ] ) % mod )


```

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long mod = (long)Math.pow(10, 9) + 7;

        List<Long> coef = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (int i = 0; i < n - coef.stream().mapToLong(Long::longValue).sum(); i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);

        long[][] dp = new long[k + 1][coef.size()];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = coef.size() - 1; j >= 0; j--) {
                tmp += dp[i - 1][coef.size() - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }

        long result = 0;
        for (int i = 0; i < coef.size(); i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It calculates the sum of the coefficients of the binomial expansion of `n` choose `k`, modulo `10^9 + 7`. The binomial coefficients are calculated using the formula `(n // i) - (n // (i + 1))` for `i` from `1` to `sqrt(n)`. The coefficients are stored in a list and then reversed. The dynamic programming table `dp` is initialized with the base case `dp[0][0] = 1`. For each `i` from `1` to `k`, the code calculates the sum of the products of the coefficients and the previous `dp` values, modulo `10^9 + 7`. The final result is the sum of the `dp[k]` values, also modulo `10^9 + 7`.
<|EOT|>
