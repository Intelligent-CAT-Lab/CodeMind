<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 30

Expected output:
10


```
a,b= map(int, input().split())
if a < b:
    print(b-a)
else:
    print(a-b)

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
        scanner.close();

        if (a < b) {
            System.out.println(b - a);
        } else {
            System.out.println(a - b);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the absolute difference between them, and prints the result.
<|EOT|>
