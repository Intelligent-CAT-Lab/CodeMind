<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
R, G, B, n = map(int, input().split())
cnt = 0
for r in range(n//R+1):
    for g in range((n-r*R)//G+1):
        b = (n-r*R-g*G)//B
        if r * R + g * G + b * B == n:
            cnt += 1

print(cnt)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int n = scanner.nextInt();
        int cnt = 0;

        for (int r = 0; r <= n/R; r++) {
            for (int g = 0; g <= (n-r*R)/G; g++) {
                int b = (n-r*R-g*G)/B;
                if (r * R + g * G + b * B == n) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
```

This Java code does the same thing as your Python code. It reads four integers from the input, then it iterates over possible values of `r`, `g`, and `b`, and increments `cnt` if the sum of `r*R`, `g*G`, and `b*B` equals `n`. Finally, it prints the value of `cnt`.
<|EOT|>
