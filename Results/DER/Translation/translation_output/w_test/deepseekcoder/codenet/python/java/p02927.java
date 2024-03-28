<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
15 40

Expected output:
10


```
m,d = map(int,input().split())
ans = 0
for i in range(22,d+1):
  d0 = i%10
  d1 = int(i/10)
  if d0 == 1 or d0 == 0:
    continue
  if m >= d0 * d1:
    ans += 1
    #print(i)
print(ans)
```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int ans = 0;
        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;
            if (d0 == 1 || d0 == 0)
                continue;
            if (m >= d0 * d1)
                ans++;
        }
        System.out.println(ans);
    }
}
```

This Java code does exactly the same thing as the Python code. It reads two integers from the input, then it iterates over the range from 22 to the provided second integer (inclusive). For each number in this range, it checks if the last digit is 1 or 0, and if so, it skips the current iteration. If the last digit is neither 1 nor 0, it then checks if the first integer is greater than or equal to the product of the last digit and the first digit of the number. If this condition is true, it increments the counter `ans`. Finally, it prints the value of `ans`.
<|EOT|>
