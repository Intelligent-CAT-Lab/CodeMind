<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10

Expected output:
1
2
3
4
5
6
7
8
9
19


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
Here is the Java version of the provided Python code:

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
        scanner.close();
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

This Java code does the same thing as the Python code. It reads an integer `K` from the standard input, then for each `i` from 1 to `K`, it calculates `x = a + d` and `y = a + 10 * d`, and then it prints the smaller of `x` and `y` (based on the condition `x/snuke(x) <= y/snuke(y)`). If `x` is smaller, `a` is updated to `x`, otherwise `a` is updated to `y` and `d` is multiplied by 10. The function `snuke(x)` calculates the sum of the digits of `x`.
<|EOT|>
