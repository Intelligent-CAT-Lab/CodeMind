<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long mod = (long) Math.pow(10, 9) + 7;
        System.out.println(pow(m, n, mod));
    }

    public static long pow(int base, int exponent, long mod) {
        long result = 1;
        base = base % (int) mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result = (result * base) % mod;
            }
            exponent = exponent >> 1;
            base = (base * base) % (int) mod;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `m` and `n` from the standard input, calculates `m^n mod 10^9 + 7`, and prints the result. The `pow` function is a modified version of the standard `Math.pow` function that works with large numbers and a modulus.<｜end▁of▁sentence｜>
