<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        final long mod = 1000000007;
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long k = scanner.nextLong();
        List<Long> coef = new ArrayList<>();
        for (long i = 1; i <= Math.sqrt(n); i++) {
            coef.add((n / i) - (n / (i + 1)));
        }
        for (long i = 0; i < n - coef.stream().mapToLong(Long::longValue).sum(); i++) {
            coef.add(1L);
        }
        Collections.reverse(coef);
        int nn = coef.size();
        long[][] dp = new long[k + 1][nn];
        dp[0][0] = 1;
        for (int i = 1; i <= k; i++) {
            long tmp = 0;
            for (int j = nn - 1; j >= 0; j--) {
                tmp += dp[i - 1][nn - 1 - j];
                tmp %= mod;
                dp[i][j] = coef.get(j) * tmp;
                dp[i][j] %= mod;
            }
        }
        long sum = 0;
        for (int i = 0; i < nn; i++) {
            sum += dp[k][i];
            sum %= mod;
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It calculates the sum of the number of ways to choose k elements from a set of n elements, where the elements are integers from 1 to n. The modulo operation is used to ensure that the result fits within the range of a 64-bit integer.<｜end▁of▁sentence｜>
