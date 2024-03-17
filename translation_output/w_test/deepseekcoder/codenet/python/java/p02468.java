<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
8


```
m,n = map(int, input().split())
mod = 10**9+7
print(pow(m,n,mod))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        long mod = (long) Math.pow(10,9) + 7;
        System.out.println(pow(m,n,mod));
    }

    public static long pow(long a, long b, long m) {
        long res = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b = b / 2;
        }
        return res;
    }
}
```

This Java code reads two integers from the input, calculates the power of the first number to the second number modulo 10^9 + 7, and prints the result. The `pow` function is a modified version of the standard exponentiation function that takes into account the modulo operation.
<|EOT|>
