<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

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
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i] = (n / i) - (n / (i + 1));
        }
        coef[n - 1] = 1;
        int[][] dp = new int[k + 1][n];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1][n - 1 - j];
                tmp %= mod;
                dp[i][j] = coef[j] * tmp;
                dp[i][j] %= mod;
            }
        }
        System.out.println(sum(dp[k]) % mod);
    }

    private static int sum(int[][] dp) {
        int sum = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                sum += dp[i][j];
            }
        }
        return sum;
    }
}
```
This is the Java code for the given Python code. The code first takes input from the user and initializes the variables `n`, `k`, and `mod`. Then, it calculates the coefficients `coef` using the formula `(n / i) - (n / (i + 1))`. The code then initializes a 2D array `dp` with size `k + 1` by `n`, and sets the value of `dp[0][0]` to 1.

The code then iterates over the values of `i` from 1 to `k`, and for each value of `i`, it calculates the value of `tmp` using the formula `tmp += dp[i - 1][n - 1 - j]`. The code then updates the value of `dp[i][j]` using the formula `dp[i][j] = coef[j] * tmp`. The code repeats this process for each value of `j` from `n - 1` to 0.

Finally, the code prints the sum of the values in the `dp` array modulo `mod`.</s>
