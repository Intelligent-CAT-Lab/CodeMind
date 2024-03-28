<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2

Expected output:
43

```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        for (int i = k; i <= n + 1; i++) {
            ans += (((2L * n - i + 1) * i) / 2) - ((i * (i - 1)) / 2) + 1;
        }
        System.out.println(ans % (long)Math.pow(10,9)+7);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the sum of the series for each value of `i` in the range from `k` to `n+1`, and then prints the result modulo `10^9+7`.

Please note that in Java, the `/` operator performs integer division when both operands are integers. To get floating-point division, at least one operand must be a `double` or `float`. Therefore, I used `2L` and `i` to ensure that at least one of them is a `long`, so that the division is performed in floating-point arithmetic.

Also, `Math.pow(10,9)` is used to get `10^9`, and `(long)` is used to cast the result of `Math.pow(10,9)` to `long`.
<|EOT|>
