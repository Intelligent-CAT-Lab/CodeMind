Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    
    private static final int MOD = (int)1e9 + 7;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(powMod(k, n, MOD));
        
        scanner.close();
    }
    
    private static long powMod(int base, int exponent, int mod) {
        long result = 1;
        long b = base;
        
        while (exponent > 0) {
            if ((exponent & 1) != 0) {
                result = (result * b) % mod;
            }
            exponent >>= 1;
            b = (b * b) % mod;
        }

        return result;
    }
}
```

To test this code:

Input:
```
2 3
```

Expected output:
```
20
```

Explanation: In this code, we have defined a `powMod` function to compute `k^n % MOD` without getting in trouble with integer overflow (commonly known as modular exponentiation). The function iteratively squares the base and multiplies it to our result when a set bit is found in the current exponent. We consistently take the modulus on each step to keep the numbers small.
