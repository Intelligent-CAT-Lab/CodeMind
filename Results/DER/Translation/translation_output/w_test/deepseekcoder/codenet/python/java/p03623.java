<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 2 7

Expected output:
B


```
x,a,b=map(int,input().split())
print('A' if abs(x-a)<abs(x-b) else 'B')
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (Math.abs(x - a) < Math.abs(x - b)) {
            System.out.println('A');
        } else {
            System.out.println('B');
        }
    }
}
```

This Java code reads three integers from the standard input, calculates the absolute differences between the first integer and the other two, and prints 'A' if the absolute difference between the first integer and the second integer is smaller, and 'B' otherwise.
<|EOT|>
