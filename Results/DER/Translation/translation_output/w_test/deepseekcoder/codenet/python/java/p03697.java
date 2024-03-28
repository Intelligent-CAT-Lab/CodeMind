<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3

Expected output:
9


```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

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

        try {
            int sum = a + b;
            if (sum < 10) {
                throw new Exception("error");
            }
            System.out.println(sum);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, adds them together, and prints the result if it is greater than or equal to 10. If the result is less than 10, it throws an exception with the message "error".
<|EOT|>
