<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
print(b/a)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double a = Math.min(W/2, x + w/2) + Math.max(-W/2, x-w/2);
        double b = Math.min(H/2, y + h/2) + Math.max(-H/2, y-h/2);
        System.out.println(b/a);
    }
}
```

This Java code does the same thing as the Python code. It reads six integers from the input, calculates the values of `a` and `b` as per the Python code, and then prints the result of `b/a`.
<|EOT|>
