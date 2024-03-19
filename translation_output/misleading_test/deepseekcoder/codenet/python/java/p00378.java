<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
180 100 2400

Expected output:
491

```
A, B, X = map(int, input().split())
k = (X // 1000)
ans = k * min(A, 2*B)
r = X - 1000*k
if 0 < r <= 500:
    ans += min(A, B)
elif 500 < r:
    ans += min(A, 2*B)
print(ans)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int X = scanner.nextInt();

        int k = X / 1000;
        int ans = k * Math.min(A, 2*B);
        int r = X - 1000*k;
        if (0 < r && r <= 500) {
            ans += Math.min(A, B);
        } else if (r > 500) {
            ans += Math.min(A, 2*B);
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the value of `k`, and then calculates the value of `ans` based on the conditions in the Python code. Finally, it prints the value of `ans`.
<|EOT|>
