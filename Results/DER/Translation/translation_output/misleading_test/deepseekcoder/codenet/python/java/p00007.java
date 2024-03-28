<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5

Expected output:
130038

```
ans = 100000
for _ in range(int(input())):
    ans *= 1.05
    if ans % 1000:
        ans += 1000 - ans % 1000
print(int(ans))

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int years = scanner.nextInt();
        double ans = 100000;
        for (int i = 0; i < years; i++) {
            ans *= 1.05;
            if ((int)ans % 1000 != 0) {
                ans += 1000 - (int)ans % 1000;
            }
        }
        System.out.println((int)ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, which represents the number of years, and then calculates the final amount after the specified number of years. The calculation is done in a loop, where the amount is increased by 5% and rounded up to the nearest 1000. The final amount is then printed to the standard output.
<|EOT|>
