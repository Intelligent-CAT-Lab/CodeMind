<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
2


```
l=input().split()
A=int(l[0])
B=int(l[1])
kimawasi=B//A
if B%A>0:
    kimawasi=kimawasi+1
print(kimawasi)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the integer division of B by A and checks if there is a remainder. If there is, it increments the result by one. The result is then printed to the standard output.
<|EOT|>
