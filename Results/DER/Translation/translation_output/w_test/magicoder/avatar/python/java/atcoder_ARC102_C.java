<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 200000

Expected output:
0


```
K , N = map ( int , input ( ) . split ( ) )
mod = 998244353
def inved ( a ) :
    x , y , u , v , k , l = 1 , 0 , 0 , 1 , a , mod
    while l != 0 :
        x , y , u , v = u , v , x - u * ( k // l ) , y - v * ( k // l )
        k , l = l , k % l
    return x % mod
X = [ 0 for i in range ( 2 * K - 1 ) ]
frac = [ 1 ]
for i in range ( N + K ) :
    frac . append ( ( ( i + 1 ) * frac [ i ] ) % mod )
invf = [ ]
for i in range ( N + K + 1 ) :
    invf . append ( inved ( frac [ i ] ) )
for k in range ( 2 , K + 2 ) :
    S = 0
    sign = 1
    l = k // 2
    for m in range ( min ( l + 1 , N // 2 + 1 ) ) :
        prod = ( sign * ( frac [ l ] * frac [ N + K - 2 * m - 1 ] ) ) % mod
        prod *= ( invf [ m ] * invf [ l - m ] ) % mod
        prod %= mod
        prod *= ( invf [ N - 2 * m ] * invf [ K - 1 ] ) % mod
        prod %= mod
        S += prod
        S %= mod
        sign *= - 1
    X [ k - 2 ] , X [ 2 * K - k ] = S , S
for i in range ( 2 * K - 1 ) :
    print ( X [ i ] )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.*;

public class Main {
    static final int mod = 998244353;
    static int K, N;
    static long[] frac, invf, X;

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long t = k / l;
            x = u; y = v; u = x - u * t; v = y - v * t;
            k = l; l = k % l;
        }
        return x % mod;
    }

    static void solve() {
        frac = new long[N + K + 1];
        invf = new long[N + K + 1];
        X = new long[2 * K - 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }
        for (int k = 2; k <= K + 1; k++) {
            long S = 0, sign = 1;
            int l = k / 2;
            for (int m = 0; m <= Math.min(l, N / 2); m++) {
                long prod = (sign * frac[l] * frac[N + K - 2 * m - 1]) % mod;
                prod = (prod * invf[m] * invf[l - m]) % mod;
                prod = (prod * invf[N - 2 * m] * invf[K - 1]) % mod;
                S = (S + prod) % mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K = sc.nextInt();
        N = sc.nextInt();
        solve();
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `K` and `N` from the standard input, and then it calculates and prints the values of `X[i]` for `i` from `0` to `2*K-2`.<｜end▁of▁sentence｜>
