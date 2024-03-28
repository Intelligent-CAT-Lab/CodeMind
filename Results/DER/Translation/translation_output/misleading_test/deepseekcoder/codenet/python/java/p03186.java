<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
-35

```
a,b,c=map(int,input().split())
if c<=a+b+1:
    print(b+c)
else:
    print(a+2*b+1)

```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (c <= a + b + 1) {
            System.out.println(b + c);
        } else {
            System.out.println(a + 2 * b + 1);
        }
    }
}
```

This Java code reads three integers from the standard input, and then prints the result of the calculation based on the conditions in the Python code.
<|EOT|>
