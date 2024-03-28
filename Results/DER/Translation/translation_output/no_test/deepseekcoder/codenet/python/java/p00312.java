<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
D, L = map(int,input().split())
ans = int(D/L) + (D-L*int(D/L))
print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int L = scanner.nextInt();
        int ans = D/L + (D-L*(D/L));
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, divides the first by the second, adds the result to the remainder of the division of the first by the second, and prints the result.
<|EOT|>
