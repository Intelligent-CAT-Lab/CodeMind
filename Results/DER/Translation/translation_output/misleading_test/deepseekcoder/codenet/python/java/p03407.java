<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
50 100 120

Expected output:
4hd

```
A, B, C = map(int, input().split())

if A + B < C:
    print("No")
else:
    print("Yes")
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if (A + B < C) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code reads three integers from the standard input, and then checks if the sum of the first two integers is less than the third integer. If it is, it prints "No"; otherwise, it prints "Yes".
<|EOT|>
