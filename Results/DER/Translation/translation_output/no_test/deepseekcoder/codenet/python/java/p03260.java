<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b = map(int, input().split())
print("Yes" if a % 2 != 0 and b % 2 != 0 else "No")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a % 2 != 0 && b % 2 != 0) ? "Yes" : "No");
    }
}
```
<|EOT|>
