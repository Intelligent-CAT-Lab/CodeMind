<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
0 0


```
print(*divmod(int(input())*2,60))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int quotient = input * 2 / 60;
        int remainder = input * 2 % 60;
        System.out.println(quotient + " " + remainder);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, multiplies it by 2, divides it by 60 to get the quotient and the remainder when divided by 60, and then prints the quotient and remainder.
<|EOT|>
