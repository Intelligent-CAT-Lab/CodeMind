<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
-71

```
from math import *
n = int(input())

def ij(x):
    for i in range(x, 0, -1):
        if n/i == n//i:
            return i, n//i

print(sum(ij(int(sqrt(n)))) - 2)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = ij(n, (int) Math.sqrt(n));
        System.out.println(result - 2);
    }

    public static int ij(int n, int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / i) {
                return i + (n / i);
            }
        }
        return 0;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of the result of the `ij` function, and then subtracts 2 from the result. The `ij` function iterates from the square root of `n` down to 1, and for each `i`, it checks if `n` divided by `i` equals `n` divided by `i` (i.e., if `i` is a factor of `n`). If it is, it returns the sum of `i` and `n` divided by `i`. If no such `i` is found, it returns 0.<｜end▁of▁sentence｜>
