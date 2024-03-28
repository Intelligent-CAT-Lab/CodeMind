<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 11 4

Expected output:
-79

```
a,b,c=map(int,input().split())
if a*c<b:
    print(c)
else:
    print(b//a)
```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a * c < b) {
            System.out.println(c);
        } else {
            System.out.println(b / a);
        }
    }
}
```

This Java code reads three integers from the standard input, and then prints the result of the Python code. The division operation in Java is integer division when both operands are integers, so the `//` operator is used instead of the `/` operator.
<|EOT|>
