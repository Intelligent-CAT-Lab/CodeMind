<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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
        return factorial(i) / (factorial(i - j) * factorial(j));
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long pow(int base, int exponent) {
        long result = 1;
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            exponent >>= 1;
            base *= base;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the combination of `k` and `i`, and then calculates the sum of the products of `(k - i) ** n` and the combination of `k` and `i`. If `i` is even, it adds the product to the sum; if `i` is odd, it subtracts the product from the sum. The final result is the sum modulo `10**9 + 7`.
<|EOT|>
