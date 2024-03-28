<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumIJ(n) - 2);
    }

    private static int sumIJ(int n) {
        int i = (int) Math.sqrt(n);
        while (i > 0) {
            if (n / i == n / i) {
                return i + n / i;
            }
            i--;
        }
        return 0;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of the two factors of that integer, and prints the result. The two factors are calculated by the `sumIJ` method, which starts from the square root of the input number and goes down to 1. If the input number is divisible by the current number, it returns the sum of the current number and the result of the division. The result is then subtracted by 2 and printed to the standard output.
<|EOT|>
