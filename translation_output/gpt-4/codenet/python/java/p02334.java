Here is the Python code translated into Java. Since Java does not support tuple assignments like Python, I've broken the input part into two separate lines. In Java, `BigInteger` is used to perform modInverse and mod operations due to the potentially large numbers in the problem, which would overflow the `long` type:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        BigInteger MOD = BigInteger.valueOf(1000000007);
        
        BigInteger p = BigInteger.ONE;
        BigInteger q = BigInteger.ONE;
        
        for (int i = 0; i < N; i++) {
            p = p.multiply(BigInteger.valueOf(N + K - 1 - i)).mod(MOD);
            q = q.multiply(BigInteger.valueOf(i + 1)).mod(MOD);
        }
        
        BigInteger result = p.multiply(q.modInverse(MOD)).mod(MOD);
        
        System.out.println(result);
    }
}
```

I've translated the `pow` function from Python to use `modInverse` on `q`, since `pow(q, MOD-2, MOD)` is used to find the modular multiplicative inverse of `q` in the context of `MOD` when `MOD` is prime. The `modInverse` method of `BigInteger` performs the same task in Java.
