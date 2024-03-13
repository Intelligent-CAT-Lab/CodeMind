<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.Scanner;

public class Main {
    static final long mod = 998244353;

    static long inved(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long t = k / l;
            x = u;
            y = v;
            u = x - u * t;
            v = y - v * t;
            k = l;
            l = k % l;
        }
        return x % mod;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int N = scanner.nextInt();
        long[] frac = new long[N + K + 1];
        frac[0] = 1;
        for (int i = 1; i <= N + K; i++) {
            frac[i] = (i * frac[i - 1]) % mod;
        }
        long[] invf = new long[N + K + 1];
        for (int i = 0; i <= N + K; i++) {
            invf[i] = inved(frac[i]);
        }
        long[] X = new long[2 * K - 1];
        for (int k = 2; k <= K + 1; k++) {
            long S = 0;
            int sign = 1;
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
}
```

Please note that the code is not exactly the same as the Python code. The Python code uses a function `inved` to calculate the modular multiplicative inverse, but Java does not have a built-in function for this. Therefore, I implemented the extended Euclidean algorithm to calculate the modular multiplicative inverse.<｜end▁of▁sentence｜>
