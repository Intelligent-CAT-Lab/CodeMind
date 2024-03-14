<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
import math
import sys
input = sys.stdin.readline

k = int(input())

n = 512
pattern = 0
a = []
for i in range(n):
    val = math.factorial(7 + i) // math.factorial(i) // math.factorial(7)
    a.append(val)
a.reverse()

cnt = 600 * 7 
ans = ["FESTIVA" for _ in range(n)]
for i, item in enumerate(a):
    ans[i] += ("L" * (k // item))
    k %= item
ans.reverse()
print("".join([str(item) for item in ans]))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int n = 512;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = factorial(7 + i) / (factorial(i) * factorial(7));
            a[i] = val;
        }

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
        }

        for (int i = 0; i < n; i++) {
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(ans[i]);
        }
    }

    private static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates factorials, and uses them to generate a string array. The string array is then printed to the standard output. The `factorial` method is a helper method that calculates the factorial of a number.
<|EOT|>
