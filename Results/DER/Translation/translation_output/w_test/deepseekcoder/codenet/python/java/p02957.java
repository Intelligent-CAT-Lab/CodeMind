<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 16

Expected output:
9


```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

### Response:
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double x = (Math.pow(A, 2) - Math.pow(B, 2)) / (2.0 * (A - B));
        if (x % 1 == 0) {
            System.out.println((int) x);
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the value of `x`, and then checks if `x` is an integer. If `x` is an integer, it prints `x`. Otherwise, it prints "IMPOSSIBLE".
<|EOT|>
