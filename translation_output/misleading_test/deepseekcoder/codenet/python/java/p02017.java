<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
\o

```
H, W, X, Y = map(int, input().split())

if ((H * W) * (X + Y)) % 2:
    print('No')
else:
    print('Yes')

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        if ((H * W) * (X + Y) % 2 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, and then checks if the product of the two dimensions of the rectangle (H * W) and the sum of X and Y is odd. If it is, it prints "No", otherwise it prints "Yes".
<|EOT|>
