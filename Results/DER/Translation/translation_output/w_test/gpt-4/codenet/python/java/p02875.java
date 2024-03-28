Here is the translated Java code that performs the same operation as the provided Python script:

```java
import java.util.Scanner;

public class MyClass {
    private static final int P = 998244353;
    private static int[] fa;
    private static int[] fainv;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int nn = N + 10;
        fa = new int[nn + 1];
        fainv = new int[nn + 1];
        fa[0] = 1;

        for (int i = 0; i < nn; i++) {
            fa[i + 1] = (int)(((long)fa[i] * (i + 1)) % P);
        }

        fainv[nn] = pow(fa[nn], P - 2, P);

        for (int i = nn - 1; i >= 0; i--) {
            fainv[i] = (int)(((long)fainv[i + 1] * (i + 1)) % P);
        }

        int ans = pow(3, N, P);
        for (int i = N / 2 + 1; i <= N; i++) {
            ans = (ans - 2 * C(N, i) * pow(2, N - i, P) % P + P) % P;
        }

        System.out.println(ans);
    }

    private static int C(int a, int b) {
        if (0 <= b && b <= a) {
            return (int)(((long)fa[a] * fainv[b] % P * fainv[a - b]) % P);
        }
        return 0;
    }

    private static int pow(int base, int exponent, int mod) {
        int result = 1;
        base %= mod;

        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (int)(((long)result * base) % mod);
            }
            exponent >>= 1;
            base = (int)(((long)base * base) % mod);
        }

        return result;
    }
}
```

Please note the following when translating from Python to Java:
- In Java, we are dealing with integer overflow, so it is necessary to cast multiplication to 'long' and then take the result modulo 'P'.
- The 'pow' function is manually implemented as Java's `Math.pow` function returns a `double` which is not suitable for modulus operations with large numbers.
- The anonymous function `C` in the Python code is converted into the private static method `C` in the Java code.
- Java does not have built-in big integer factorial or modular inverse functions like Python, so we are computing them manually in the code.
- Instead of directly decrementing the `ans` as in the Python code, we add `P` before taking the modulo to avoid negative results due to the way Java handles the modulo operation with negative numbers.
