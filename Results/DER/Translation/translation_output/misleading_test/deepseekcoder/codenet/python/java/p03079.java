<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 2 2

Expected output:
Y9s

```
a, b, c = map(int, input().split())
if a == b and b == c :
    print("Yes")
else :
    print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b && b == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads three integers from the standard input, and then checks if they are all equal. If they are, it prints "Yes"; otherwise, it prints "No".
<|EOT|>
