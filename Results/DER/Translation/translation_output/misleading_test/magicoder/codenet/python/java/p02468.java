<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
77

```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

@@ Response
Here is the Java version of the given Python code:

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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the power of the first integer to the second integer modulo a large prime number (10^9 + 7), and prints the result.

The `pow` method is a custom method that implements the power function with modulo operation. It uses the binary exponentiation method to calculate the power efficiently.<｜end▁of▁sentence｜>
