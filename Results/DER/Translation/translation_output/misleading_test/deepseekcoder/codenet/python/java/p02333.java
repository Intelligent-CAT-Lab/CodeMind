<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 3

Expected output:
92

```
import math


def combination(i: int, j: int) -> int:
    return math.factorial(i) // math.factorial(i - j) // math.factorial(j)


if __name__ == "__main__":
    n, k = map(lambda x: int(x), input().split())
    modulo = 10 ** 9 + 7
    ans = 0
    if k <= n:
        for i in range(k):
            if 0 == i % 2:
                ans += (k - i) ** n * combination(k, i)
            else:
                ans -= (k - i) ** n * combination(k, i)
        ans = ans % modulo

    print(ans)


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long modulo = (long) Math.pow(10, 9) + 7;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += pow((k - i), n) * combination(k, i);
                } else {
                    ans -= pow((k - i), n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        long result = 1;
        for (int x = 1; x <= j; x++) {
            result = result * i / x;
            i--;
        }
        return result;
    }

    public static long pow(int a, int b) {
        long result = 1;
        while (b > 0) {
            if (b % 2 == 1) {
                result = result * a % modulo;
            }
            a = a * a % (int) modulo;
            b = b / 2;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the combination of `k` and `i`, and then calculates the power of `(k - i)` to `n`. The result is then added or subtracted from the `ans` variable depending on whether `i` is even or odd. The final result is then taken modulo `modulo` to prevent overflow.
<|EOT|>
