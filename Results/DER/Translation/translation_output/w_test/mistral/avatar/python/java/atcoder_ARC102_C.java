<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        int mod = 998244353;
        int inved(int a) {
            int x = 1, y = 0, u = 0, v = 1, k = a, l = mod;
            while (l != 0) {
                x = u;
                y = v;
                u = v - x * (k / l);
                v = y - u * (k / l);
                k = l;
                l = k % l;
            }
            return x % mod;
        }
        int[] X = new int[2 * K - 1];
        int[] frac = new int[N + K];
        for (int i = 0; i < N + K; i++) {
            frac[i] = (i + 1) * frac[i] % mod;
        }
        int[] invf = new int[N + K + 1];
        for (int i = 0; i < N + K + 1; i++) {
            invf[i] = inved(frac[i]);
        }
        for (int k = 2; k <= K + 2; k++) {
            int S = 0;
            int sign = 1;
            int l = k / 2;
            for (int m = 1; m <= min(l + 1, N / 2 + 1); m++) {
                int prod = (sign * (frac[l] * frac[N + K - 2 * m - 1])) % mod;
                prod *= (invf[m] * invf[l - m]) % mod;
                prod %= mod;
                prod *= (invf[N - 2 * m] * invf[K - 1]) % mod;
                prod %= mod;
                S += prod;
                S %= mod;
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
```</s>
