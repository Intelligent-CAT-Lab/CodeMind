<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;
        List<Integer> coef = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (int i = 0; i < n - coef.stream().mapToInt(Integer::intValue).sum(); i++) {
            coef.add(1);
        }
        Collections.reverse(coef);
        int nn = coef.size();
        int[][] dp = new int[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        int sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `k` from the standard input, calculates the coefficients `coef`, and then uses dynamic programming to calculate the sum of the elements in the `dp` array. The result is then printed to the standard output.<｜end▁of▁sentence｜>
