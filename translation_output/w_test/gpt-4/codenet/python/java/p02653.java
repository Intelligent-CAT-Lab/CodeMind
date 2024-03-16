Here's the Python code translated into Java:

```java
import java.util.*;
import java.math.BigInteger;
 
public class Main {
    static final long P = 1000000007;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, aa, bb;
        n = sc.nextInt();
        aa = sc.nextInt();
        bb = sc.nextInt();

        int a = Math.max(aa, bb);
        int b = Math.min(aa, bb);

        long[] xs0 = new long[n + 1];
        long[] os0 = new long[n + 1];

        Arrays.fill(xs0, 0);
        Arrays.fill(os0, 0);
        
        os0[0] = 1;

        for (int i = b; i < a; i++) {
            for (int j = b; j <= i; j++) {
                xs0[i] += os0[i - j];
                xs0[i] %= P;
            }
            for (int j = 1; j <= i; j++) {
                os0[i] += xs0[i - j];
                os0[i] %= P;
            }
        }

        long[] os = new long[a];

        for (int i = b; i < a - 2; i++) {
            for (int j = 2; j < a - i; j++) {
                os[i + j] += xs0[i] * (j - 1);
            }
        }

        long[] x = new long[n + 1];
        long[] o = new long[n + 1];

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[i] += xs0[j];
                o[i] %= P;
            }
        }

        x[0] = 1;
        o[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < Math.min(b, i + 1); j++) {
                x[i] += o[i - j];
            }
            for (int j = 1; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j];
            }
            for (int j = b + 2; j < Math.min(a, i + 1); j++) {
                o[i] += x[i - j] * os[j];
            }
            x[i] %= P;
            o[i] %= P;
        }

        for (int i = b + 1; i < a; i++) {
            for (int j = b; j < i; j++) {
                o[n] += xs0[j] * x[n - i];
                o[i] %= P;
            }
        }

        long ans = o[n] + x[n];
        ans %= P;

        long[] beki2 = new long[5001];
        beki2[0] = 1;

        for (int i = 0; i < 5000; i++) {
            beki2[i + 1] = beki2[i] * 2;
            beki2[i + 1] %= P;
        }

        ans = beki2[n] - ans;
        ans += P;
        ans %= P;

        System.out.println(ans);
        sc.close();
    }
}
```

Now there are several things to explain regarding differences between Python and Java:
- Python dynamic lists are replaced by fixed-size arrays in Java.
- In Python, we use the `append` method to add to a list, but since we're using arrays in Java, we know the size beforehand and can assign directly.
- Division in Python by default performs floor division when using integers, but in Java, this is the default behavior, so we don't need a floor method or similar.
- Iteration over lists and arrays are done differently in Java. Instead of Python’s `range(len(x))`, in Java, we just use a standard for loop with array lengths.
- Lambda expressions in Java are not directly used for sorting with custom comparators like in Python. However, the original Python code didn't use that part, so there is no replacement in the Java version.
- BigInteger is not needed for the given test case; however, if numbers could get much larger, one would need to use BigInteger in Java to have an equivalent to Python's arbitrary-precision integers.
- The `input()` and `map()` usage in Python for reading space-separated input is replaced by a Scanner object.
- Java doesn't have built-in big integer arithmetic, so `% P` is used frequently to keep the number within the limits of standard `long`.

Keep in mind that translating the commented out `cmb` function and related code would require implementing modular multiplicative inverses and factorials, which would expand this code considerably. The provided Java code is only a direct translation of the uncommented Python code.
