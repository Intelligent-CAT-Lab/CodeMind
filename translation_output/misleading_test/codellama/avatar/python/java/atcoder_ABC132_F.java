<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3

Expected output:
140

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
[/INST]
```java
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        int[] coef = new int[n];
        for (int i = 1; i <= n; i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        coef = coef.clone();
        for (int i = 0; i < n; i++) {
            coef[i] = coef[i] % mod;
        }
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += dp[k][i];
            result %= mod;
        }
        System.out.println(result);
    }
}
```
This is the Java code for the given Python code. The code first takes input from the user and initializes the variables `n`, `k`, and `mod`. Then, it calculates the coefficients `coef` using the formula `(n / i) - (n / (i + 1))`. The coefficients are then cloned and the modulo operation is applied to each coefficient.

Next, the code initializes a 2D array `dp` with size `k + 1` and `n`. The first row of `dp` is initialized with all 0s, and the first column is initialized with 1.

The code then iterates over the rows of `dp` from 1 to `k`, and for each row, it iterates over the columns from `n - 1` to 0. For each column, it calculates the value of `dp[i][j]` using the formula `coef[j] * tmp`, where `tmp` is the sum of the previous values of `dp[i - 1][j]` and `dp[i - 1][j - 1]`. The modulo operation is applied to each value of `dp[i][j]`.

Finally, the code calculates the result by summing up the values of `dp[k][i]` for all `i` from 0 to `n - 1`, and applying the modulo operation to the result. The result is then printed to the console.</s>
