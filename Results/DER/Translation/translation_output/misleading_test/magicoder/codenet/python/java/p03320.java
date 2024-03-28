<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
45
-9
76
-23
-21
-67
-52
24
21
-13

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

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int a = 0;
        int d = 1;
        for (int i = 1; i <= K; i++) {
            int x = a + d;
            int y = a + 10 * d;
            if ((double) x / snuke(x) <= (double) y / snuke(y)) {
                a = x;
            } else {
                a = y;
                d *= 10;
            }
            System.out.println(a);
        }
    }

    public static int snuke(int x) {
        int a = 0;
        while (x > 0) {
            a += x % 10;
            x /= 10;
        }
        return a;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, then it iterates from 1 to `K`. For each iteration, it calculates `x` and `y`, and then it checks if `x` is closer to `a` than `y` is to `a`. If `x` is closer, it updates `a` to `x`, otherwise it updates `a` to `y` and `d` to `d * 10`. Finally, it prints `a`. The `snuke` function calculates the sum of the digits of a number.<｜end▁of▁sentence｜>
