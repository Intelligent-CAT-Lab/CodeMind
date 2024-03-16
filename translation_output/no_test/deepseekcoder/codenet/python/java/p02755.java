<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
A, B = map(int, input().split())
f = False
ans = 0
n = A * 100 // 8
m = (A + 1) * 100 // 8
for i in range(n, m + 1):
  if i * 8 // 100 == A and i // 10 == B:
    f = True
    ans = i
    break
print(ans if f else -1)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        boolean f = false;
        int ans = 0;
        int n = A * 100 / 8;
        int m = (A + 1) * 100 / 8;
        for (int i = n; i <= m; i++) {
            if (i * 8 / 100 == A && i / 10 == B) {
                f = true;
                ans = i;
                break;
            }
        }
        System.out.println(f ? ans : -1);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the range of possible values for the integer `i` that satisfies the condition `i * 8 / 100 == A` and `i / 10 == B`, and then prints the smallest `i` in this range or `-1` if no such `i` exists.
<|EOT|>
