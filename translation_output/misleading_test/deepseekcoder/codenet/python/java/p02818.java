<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3 3

Expected output:
1 76

```
a, b, k = map(int, input().split())
if a <= k:
    k -= a
    a = 0
else:
    print(a - k, b)
    exit()
print(0, max(b - k, 0))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        if (a <= k) {
            k -= a;
            a = 0;
        } else {
            System.out.println(a - k + " " + b);
            System.exit(0);
        }
        System.out.println("0 " + Math.max(b - k, 0));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, and then checks if `a` is less than or equal to `k`. If it is, it subtracts `a` from `k` and sets `a` to 0. If `a` is greater than `k`, it prints `a - k` and `b` and then exits the program. If `a` is not less than or equal to `k`, it prints `0` and the maximum of `b - k` and `0`.
<|EOT|>
