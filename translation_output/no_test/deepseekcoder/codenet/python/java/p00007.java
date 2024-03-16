<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ans = 100000;
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            ans *= 1.05;
            if (ans % 1000 != 0) {
                ans += 1000 - ans % 1000;
            }
        }
        System.out.println((int)ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, uses it to calculate a new value for `ans`, and then prints the result. The calculation is done in a loop, where `ans` is increased by 5% and rounded up to the nearest 1000.
<|EOT|>
