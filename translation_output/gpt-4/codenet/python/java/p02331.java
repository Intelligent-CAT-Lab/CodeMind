Certainly! Below is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int) (1e9 + 7);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(power(k, n, MOD));
    }
    
    private static long power(long base, int exponent, int modulus) {
        long result = 1;
        
        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % modulus;
            base = (base * base) % modulus;
            exponent >>= 1;
        }
        
        return result;
    }
}
```

This Java program starts by declaring the `MOD` constant and its main method. It then reads two integers, `n` and `k`, from the standard input using the `Scanner` class. Next, it prints the result of `k` to the power of `n`, modulo `MOD`, which is computed using the `power` function.

The `power` function performs modular exponentiation using the iterative method to avoid integer overflow and effectively calculate large powers under the modulus.
