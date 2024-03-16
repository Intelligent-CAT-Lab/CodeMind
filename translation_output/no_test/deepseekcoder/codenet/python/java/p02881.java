<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sqrtN = (int) Math.sqrt(n);
        int[] ij = ij(sqrtN);
        System.out.println(sum(ij[0], ij[1]) - 2);
    }

    private static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / i) {
                return new int[]{i, n / i};
            }
        }
        return new int[]{0, 0};
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, finds the largest `i` and `n // i` such that `n / i` is an integer, and then prints the sum of these two numbers minus 2.
<|EOT|>
