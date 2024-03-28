<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 3

Expected output:
140

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

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner ( System.in );
        int n = sc.nextInt ( );
        int k = sc.nextInt ( );
        int mod = (int) ( 1e9 + 7 );
        int[] coef = new int[n];
        for (int i = 1; i <= (int) Math.sqrt(n); i++) {
            coef[i - 1] = (n / i) - (n / (i + 1));
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += coef[i];
        }
        int[] dp = new int[k + 1];
        dp[0] = 1;
        for (int i = 1; i <= k; i++) {
            int tmp = 0;
            for (int j = n - 1; j >= 0; j--) {
                tmp += dp[i - 1] * coef[j];
                tmp %= mod;
                dp[i] += tmp;
                dp[i] %= mod;
            }
        }
        System.out.println ( dp[k] );
    }
}
```
<|endoftext|>
