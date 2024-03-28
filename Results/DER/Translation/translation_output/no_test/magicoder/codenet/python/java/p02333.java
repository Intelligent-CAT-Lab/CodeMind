<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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
        long modulo = (long) Math.pow(10, 9) + 7;
        long ans = 0;
        if (k <= n) {
            for (int i = 0; i < k; i++) {
                if (i % 2 == 0) {
                    ans += Math.pow(k - i, n) * combination(k, i);
                } else {
                    ans -= Math.pow(k - i, n) * combination(k, i);
                }
                ans %= modulo;
            }
        }
        System.out.println(ans);
    }

    public static long combination(int i, int j) {
        long result = 1;
        for (int x = 1; x <= i; x++) {
            result *= x;
        }
        for (int x = 1; x <= j; x++) {
            result /= x;
        }
        for (int x = 1; x <= i - j; x++) {
            result /= x;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the combination of two integers, and then prints the result. The combination function calculates the combination of two integers using the formula `n! / (k! * (n-k)!)`. The result is then calculated using the formula `(k - i) ^ n * combination(k, i)`. If `i` is even, the result is added to `ans`, otherwise it is subtracted from `ans`. The result is then taken modulo `10^9 + 7` to prevent overflow.<｜end▁of▁sentence｜>
