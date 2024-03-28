<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long modulo = 1000000007;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= Math.pow(k - i, n) * combination(k, i);
                }
            }
            ans = ans % modulo;
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        long result = 1;
        for (int x = 1; x <= j; x++) {
            result = result * (i - x + 1) / x;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the combination of two integers, and then prints the result. The combination function uses the formula for the combination of two integers, which is `n! / (k!(n-k)!)`. The `Math.pow` function is used to calculate the power of a number. The `%` operator is used to calculate the remainder of the division. The `if` statement checks if `k` is less than or equal to `n`. If it is, the code calculates the combination and the power of `k - i` and adds or subtracts it from the `ans` variable. The `ans` variable is then printed.<｜end▁of▁sentence｜>
