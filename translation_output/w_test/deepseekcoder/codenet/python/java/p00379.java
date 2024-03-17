<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
16 2 1000

Expected output:
3


```
a, n, m = map(int, input().split())
ans = 0
for y in range(1, 50):
    x = (y + a)**n
    if 1 <= x <= m and y == sum(map(int, str(x))):
        ans += 1
print(ans)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;
        for (int y = 1; y < 50; y++) {
            int x = (int) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sumOfDigits(x)) {
                ans++;
            }
        }
        System.out.println(ans);
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then it iterates over the range from 1 to 49. For each `y`, it calculates `x = (y + a)^n`, and if `1 <= x <= m` and `y` is equal to the sum of the digits of `x`, it increments the counter `ans`. Finally, it prints the value of `ans`.

The `sumOfDigits` method calculates the sum of the digits of a given number. It does this by repeatedly taking the last digit of the number (using the modulo operator), adding it to the sum, and then removing the last digit of the number (using integer division). This process continues until the number is 0.
<|EOT|>
