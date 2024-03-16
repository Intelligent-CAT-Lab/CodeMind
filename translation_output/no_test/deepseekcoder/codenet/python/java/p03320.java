<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
K = int(input())
a = 0
d = 1
def snuke(x):
    a = 0
    while x>0:
        a += x%10
        x //= 10
    return a
for i in range(1, K+1):
    x = a + d
    y = a + 10*d
    if x/snuke(x) <= y/snuke(y):
        a = x
    else:
        a = y
        d *= 10
    print(a)

```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        long a = 0;
        long d = 1;

        for (int i = 1; i <= K; i++) {
            long x = a + d;
            long y = a + 10 * d;
            if (x / snuke(x) <= y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static long snuke(long x) {
        long a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `K` from the standard input, initializes `a` and `d` to 0 and 1, and then enters a loop that runs `K` times. In each iteration of the loop, it calculates `x` and `y`, and then checks which of `x` and `y` is smaller when divided by the sum of their digits (as calculated by the `snuke` function). The smaller value is then assigned to `a`, and if `y` was chosen, `d` is multiplied by 10. Finally, it prints the current value of `a`.
<|EOT|>
