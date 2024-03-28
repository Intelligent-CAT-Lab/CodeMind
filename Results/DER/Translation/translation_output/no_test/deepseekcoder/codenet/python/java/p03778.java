<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(a-b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a-b) - w);
        }
    }
}
```
<|EOT|>
