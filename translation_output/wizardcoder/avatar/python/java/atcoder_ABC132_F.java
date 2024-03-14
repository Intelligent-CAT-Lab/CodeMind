Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
mod = 10 ** 9 + 7
n, k = map ( int, input ( ). split ( ) )
coef = [ ]
for i in range ( 1, int ( n ** 0.5 ) + 1 ) :
    coef. append ( ( n // i ) - ( n // ( i + 1 ) ) )
coef += [ 1 ] * ( n - sum ( coef ) )
coef = coef [ : : - 1 ]
nn = len ( coef )
dp = [ [ 0 ] * nn for _ in range ( k + 1 ) ]
dp [ 0 ] [ 0 ] = 1
for i in range ( 1, k + 1 ) :
    tmp = 0
    for j in range ( nn - 1, - 1, - 1 ) :
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
        Scanner sc = new Scanner(System.in);
        int mod = (int) Math.pow(10, 9) + 7;
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] coef = new int[n];
        for (int i = 1; i <= Math.sqrt(n); i++) {
            coef[i-1] = (n / i) - (n / (i+1));
        }
        int sum = 0;
        for (int i = Math.sqrt(n); i < n; i++) {
            coef[i] = 1;
        }
        for (int i = n-1; i >= 0; i--) {
            sum += coef[i];
            coef[i] = sum;
        }
        int[][] dp = new int[k+1][n];
        for (int i = 0; i <= k; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j]) % mod;
                dp[i][j] = (dp[i][j] * coef[j]) % mod;
            }
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = (ans + dp[k][i]) % mod;
        }
        System.out.println(ans);
    }
}
```<|endoftext|>
