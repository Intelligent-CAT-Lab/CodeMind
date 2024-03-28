Below is the equivalent Java code for your provided Python code:

```java
import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class Main {
    static final long MOD = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        int K = Integer.parseInt(input[2]);

        BigInteger[] power2 = makePower(BigInteger.valueOf(2), N + M, MOD);
        BigInteger[] power2Inv = makePower(BigInteger.valueOf(2).modInverse(BigInteger.valueOf(MOD)), N + M, MOD);
        BigInteger[] power3 = makePower(BigInteger.valueOf(3), N + M, MOD);
        BigInteger[] power3Inv = makePower(BigInteger.valueOf(3).modInverse(BigInteger.valueOf(MOD)), N + M, MOD);
        BigInteger[] fact = makeFact(N + M, MOD);
        BigInteger[] factInv = makeFactInv(fact, MOD);

        BigInteger[] x = new BigInteger[N + M];
        Arrays.fill(x, BigInteger.ZERO);
        BigInteger[] coef = new BigInteger[M + 1];
        for (int i = 1; i <= M; i++) {
            x[i] = power2[i - 1].multiply(power3Inv[K + i]).mod(BigInteger.valueOf(MOD))
                    .multiply(fact[K + i].multiply(factInv[K]).multiply(factInv[i]).mod(BigInteger.valueOf(MOD)))
                    .negate().mod(BigInteger.valueOf(MOD));
            coef[M - i] = fact[N - 1 + i].multiply(factInv[i]).multiply(factInv[N - 1]).mod(BigInteger.valueOf(MOD))
                    .multiply(power3[K + i]).mod(BigInteger.valueOf(MOD));
        }
        x[0] = BigInteger.valueOf(3).multiply(BigInteger.ONE.subtract(power3Inv[K + 1]))
                .multiply(power2Inv[0]).mod(BigInteger.valueOf(MOD));

        for (int i = 1; i < N + M; i++) {
            x[i] = x[i].add(x[i - 1]).mod(BigInteger.valueOf(MOD));
        }
        for (int i = 0; i < N + M; i++) {
            x[i] = x[i].multiply(power3[i]).multiply(power2Inv[i]).mod(BigInteger.valueOf(MOD));
        }

        BigInteger answer = BigInteger.ZERO;
        for (int i = N - 1, j = 0; i < N + M; i++, j++) {
            answer = answer.add(coef[j].multiply(x[i]).mod(BigInteger.valueOf(MOD)));
        }
        answer = answer.mod(BigInteger.valueOf(MOD));
        System.out.println(answer);
    }

    static BigInteger[] makePower(BigInteger a, int L, long MOD) {
        BigInteger[] x = new BigInteger[L];
        x[0] = BigInteger.ONE;
        for (int i = 1; i < L; i++) {
            x[i] = x[i - 1].multiply(a).mod(BigInteger.valueOf(MOD));
        }
        return x;
    }

    static BigInteger[] makeFact(int U, long MOD) {
        BigInteger[] fact = new BigInteger[U];
        fact[0] = BigInteger.ONE;
        for (int i = 1; i < U; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i)).mod(BigInteger.valueOf(MOD));
        }
        return fact;
    }

    static BigInteger[] makeFactInv(BigInteger[] fact, long MOD) {
        BigInteger[] factInv = new BigInteger[fact.length];
        factInv[fact.length - 1] = fact[fact.length - 1].modInverse(BigInteger.valueOf(MOD));
        for (int i = fact.length - 2; i >= 0; i--) {
            factInv[i] = factInv[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(BigInteger.valueOf(MOD));
        }
        return factInv;
    }
}
```

This Java code performs the operations described in the Python code with an emphasis on dealing with big integers and modular arithmetic using Java's `BigInteger` class. Note that due to differences between Python's `numpy` library and Java's default libraries, this Java code does not make use of any external mathematical libraries for matrix operations or specialized functions of `numpy`. The multi-dimensional array manipulations and cumprod function from the Python code have not been included since they are not necessary for the Java implementation. Instead, simple loops and `BigInteger` operations suffice.

Make sure you use Java 8 or newer to have the `BigInteger.modInverse` method available. Otherwise, you need to implement the modular inverse yourself using the Extended Euclidean Algorithm.
