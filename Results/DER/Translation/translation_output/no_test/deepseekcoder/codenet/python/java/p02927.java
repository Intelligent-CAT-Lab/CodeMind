<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
            if (d0 == 1 || d0 == 0) {
                continue;
            }
            if (m >= d0 * d1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, then it iterates over the range from 22 to the second integer (inclusive). For each number in this range, it checks if the last digit is 1 or 0, and if so, it skips to the next iteration. If the last digit is neither 1 nor 0, it then checks if the first integer is greater than or equal to the product of the last digit and the first digit of the number. If this is true, it increments the answer. Finally, it prints the answer.
<|EOT|>
