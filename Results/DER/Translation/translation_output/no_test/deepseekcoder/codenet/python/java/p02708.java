<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
ans=0
for i in range(k,n+2):
    ans+=(((2*n-i+1)*i)//2)-(i*(i-1)//2)+1
print(ans%(10**9+7))
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
        for (int i = k; i <= n + 1; i++) {
            ans += (((long)(2 * n - i + 1) * i) / 2) - ((long)i * (i - 1) / 2) + 1;
        }
        System.out.println(ans % (long)(Math.pow(10, 9) + 7));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the sum of the series for each value of `i` in the range from `k` to `n + 1`, and then prints the result modulo `10^9 + 7`. The `(long)` casts are used to avoid integer overflow, and `Math.pow(10, 9) + 7` is used to calculate the value `10^9 + 7`.
<|EOT|>
