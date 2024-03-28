<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int mod = 998244353;
    static int K, N;
    static long[] frac, invf;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        K = scanner.nextInt();
        N = scanner.nextInt();
        frac = new long[N + K + 1];
        invf = new long[N + K + 1];
        inv(K);
        for (int i = 0; i < N + K; i++) {
            frac[i + 1] = (((i + 1) * frac[i]) % mod);
        }
        for (int i = 0; i < N + K + 1; i++) {
            invf[i] = inv(frac[i]);
        }
        long[] X = new long[2 * K - 1];
        for (int k = 2; k < K + 2; k++) {
            long S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 0; m < Math.min(l + 1, N / 2 + 1); m++) {
                long prod = (sign * (frac[l] * frac[N + K - 2 * m - 1]) % mod);
                prod = (prod * (invf[m] * invf[l - m]) % mod);
                prod = (prod * (invf[N - 2 * m] * invf[K - 1]) % mod);
                prod %= mod;
                S += prod;
                S %= mod;
                sign *= -1;
            }
            X[k - 2] = S;
            X[2 * K - k - 1] = S;
        }
        for (int i = 0; i < 2 * K - 1; i++) {
            System.out.println(X[i]);
        }
    }

    public static long inv(long a) {
        long x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
        while (l != 0) {
            long tmp = u;
            u = x - u * (k / l);
            x = tmp;
            tmp = v;
            v = y - v * (k / l);
            y = tmp;
            k %= l;
            l = k;
        }
        return x < 0 ? x + mod : x;
    }
}
```

This Java code does the same thing as your Python code. It reads two integers K and N from the input, calculates the modular inverse of numbers from 1 to N + K, and then calculates the values of X for different k. The results are printed to the standard output.
<|EOT|>
