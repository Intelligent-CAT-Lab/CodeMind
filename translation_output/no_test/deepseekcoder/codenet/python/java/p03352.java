<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = int(input())
ans = 1
for b in range(x):
    for p in range(2, x):
        if b**p <= x:
            ans = max(ans, b**p)
        else:
            break
print(ans)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int ans = 1;
        for (int b = 0; b < x; b++) {
            for (int p = 2; p < x; p++) {
                if (Math.pow(b, p) <= x) {
                    ans = Math.max(ans, (int) Math.pow(b, p));
                } else {
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
```
<|EOT|>
