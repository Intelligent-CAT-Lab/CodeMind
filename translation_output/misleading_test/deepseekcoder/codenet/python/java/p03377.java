<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 4

Expected output:
YE

```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();

        if (a <= x && a + b >= x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, checks if the first one is less than or equal to the third one and if the sum of the first and second one is greater than or equal to the third one, and prints "YES" if both conditions are met, "NO" otherwise.
<|EOT|>
