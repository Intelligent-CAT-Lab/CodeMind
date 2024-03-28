Below is the Java translation of the given Python code:

```java
import java.util.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        int mod = 1000000007;
        int[] lis = new int[3300];
        lis[0] = 1;

        for (int i = N; i > 0; i--) {
            int[] nlis = new int[3300];
            for (int j = 0; j <= K; j++) {
                for (int last = 0; last < 3300; last++) {
                    if (i < j) {
                        nlis[last] += lis[last];
                        nlis[last] %= mod;
                    } else if (last + j / i + last < 3300) {
                        nlis[last + (last + j) / i] += lis[last];
                        nlis[last + (last + j) / i] %= mod;
                    }
                }
            }
            lis = nlis;
        }

        BigInteger ans = BigInteger.valueOf(K)
                                .multiply(BigInteger.valueOf(K + 1))
                                .divide(BigInteger.valueOf(2))
                                .multiply(BigInteger.valueOf(K + 1).modPow(BigInteger.valueOf(N - 1), BigInteger.valueOf(mod)))
                                .multiply(BigInteger.valueOf(N))
                                .mod(BigInteger.valueOf(mod));

        for (int i = 0; i < 3300; i++) {
            ans = ans.subtract(BigInteger.valueOf(lis[i]).multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(mod)));
            ans = ans.mod(BigInteger.valueOf(mod));
        }
        System.out.println(ans);
    }
}
```

To run the Java code, you need to have Java installed and configured on your machine. Compile the program using `javac Main.java` and run it with `java Main`, then provide the input accordingly.
