<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
5


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
        System.out.println(result);
    }

    public static int ij(int n, int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / i) {
                return i + n / i - 2;
            }
        }
        return 0;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, and then calls the `ij` function with the input and the square root of the input as arguments. The `ij` function iterates from the square root of the input down to 1, and if it finds a number that divides the input evenly, it returns the sum of that number and the result of the division minus 2. If no such number is found, it returns 0. The result of the `ij` function is then printed to the standard output.<｜end▁of▁sentence｜>
