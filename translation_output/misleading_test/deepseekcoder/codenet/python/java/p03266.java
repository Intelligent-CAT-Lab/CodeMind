<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
11

```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = 0;

        if (k % 2 == 1) {
            ans = (long) Math.pow(n / k, 3);
        } else {
            ans = (long) Math.pow(n / k, 3) + (long) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the result based on the conditions in the Python code, and prints the result. The `Math.pow` function is used to calculate the cube of a number, and the `/` operator in Java performs integer division when both operands are integers.
<|EOT|>
