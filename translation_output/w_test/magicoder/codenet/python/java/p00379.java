<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

This Java code does the same thing as the Python code. It reads three integers from the standard input, then iterates over the range from 1 to 50. For each `y`, it calculates `x = (y + a)^n`, checks if `1 <= x <= m` and `y == sum of digits of x`, and if so, increments `ans`. Finally, it prints `ans`.

The `sumOfDigits` method calculates the sum of the digits of a number. It does this by repeatedly taking the last digit of the number (using the modulo operator) and adding it to the sum, then removing the last digit from the number (by integer division by 10). This process continues until the number becomes 0.<｜end▁of▁sentence｜>
