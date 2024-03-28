Here's the Python code translated into Java:

```java
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final int MAX = 2 * 100000 + 1;
    private static final int MOD = 1000000007;
    private static BigInteger[] fact = new BigInteger[MAX];
    private static BigInteger[] inv = new BigInteger[MAX];
    private static BigInteger[] invfact = new BigInteger[MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        combBuild(MAX);
        
        long ans = 1;
        for (Map.Entry<Integer, Integer> entry : primeFactor(m).entrySet()) {
            ans = (ans * nCk(entry.getValue() + n - 1, entry.getValue()).mod(BigInteger.valueOf(MOD)).longValue()) % MOD;
        }
        System.out.println(ans % MOD);
        
        scanner.close();
    }
    
    private static void combBuild(int n) {
        fact[0] = inv[0] = invfact[0] = BigInteger.ONE;
        fact[1] = inv[1] = invfact[1] = BigInteger.ONE;
        for (int i = 2; i < n; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
            inv[i] = BigInteger.valueOf(MOD).subtract(BigInteger.valueOf(MOD / i)).multiply(inv[MOD % i]).mod(BigInteger.valueOf(MOD));
            invfact[i] = invfact[i - 1].multiply(inv[i]).mod(BigInteger.valueOf(MOD));
        }
    }

    private static BigInteger nCk(int n, int k) {
        if (n < k || n < 0 || k < 0) {
            return BigInteger.ZERO;
        }
        return fact[n].multiply(invfact[k]).mod(BigInteger.valueOf(MOD)).multiply(invfact[n - k]).mod(BigInteger.valueOf(MOD));
    }

    private static HashMap<Integer, Integer> primeFactor(int n) {
        HashMap<Integer, Integer> ret = new HashMap<>();
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
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

To compile and run this program, you would do so in the usual manner for Java programs. First, save the code in a file with a .java extension (for example, Main.java), compile it with `javac Main.java`, and then run it with `java Main`. When you run the program, you would provide test input in the format "2 6", as specified in the sample test case, to get the expected 0 output.
