Below is the translation of the given Python code to Java code:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final int MAX = 200001;
    static final int MOD = 1000000007;
    static long[] fact = new long[MAX];
    static long[] inv = new long[MAX];
    static long[] invfact = new long[MAX];
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.close();

        combBuild(MAX);
        long ans = 1;
        for (int e : primeFactor(m).values()) {
            ans = (ans * nCk(e + n - 1, e)) % MOD;
        }
        System.out.println(ans % MOD);
    }
    
    static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = 1;
        fact[1] = inv[1] = invfact[1] = 1;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1] * i % MOD;
            inv[i] = BigInteger.valueOf(fact[i]).modInverse(BigInteger.valueOf(MOD)).longValue();
            invfact[i] = invfact[i - 1] * inv[i] % MOD;
        }
    }

    static long nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return 0;
        }
        return (((fact[n] * invfact[k]) % MOD) * invfact[n - k]) % MOD;
    }

    static HashMap<Integer, Integer> primeFactor(int n) {
        HashMap<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n) + 10; i++) {
            while (n % i == 0) {
                ret.put(i, ret.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n != 1) {
            ret.put(n, 1);
        }
        return ret;
    }
}
```

Explanation of changes made to the original Python code for the translation to Java:
1. I imported `Scanner` to take input from the user and `BigInteger` for modulo inverse operations.
2. In Java, we have to define the size of the arrays before usage; that’s why we use `MAX` as the size of the arrays `fact`, `inv`, and `invfact`.
3. The main working method in Java is `public static void main(String[] args)`.
4. Implementing the `combBuild` and `nCk` functions as static methods in a class to use them in `main`.
5. Using `HashMap` for `primeFactor` to mimic the 'defaultdict' from Python and relevant operations adjusted accordingly.
6. Java does not support global immutable variables (such as the `MOD` and `MAX` variables) or tuples the way Python does, so these need to be handled differently.
7. For the iterative modulo inverse calculation, I used `BigInteger.modInverse` due to the fact that the iterative approach used in Python relies on properties of the modulus and operand that are not necessarily easy nor efficient to directly translate to Java without using larger integer classes like BigInteger.
8. Note that the Python `print()` function is replaced by `System.out.println()` in Java.
9. Input collection in Java requires explicit parsing and assignment steps.
10. Java uses explicit loops for iteration instead of Python's `for ... in ...` construct, which can often iterate directly over collections and ranges.
11. Since Java is zero-based indexing for arrays, there's no need to add or subtract 1 when initializing the `fact[1]`, `inv[1]`, `invfact[1]`.
12. Finally, the translated Java code follows the standard naming conventions of Java, which are CamelCase for method names and classes, and all uppercase letters for final variables (constants).
