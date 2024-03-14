<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
K, X = list(map(int, input().split()))
print("Yes" if 500*K>=X else "No")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int X = scanner.nextInt();
        System.out.println((500 * K >= X) ? "Yes" : "No");
    }
}
```
<|EOT|>
