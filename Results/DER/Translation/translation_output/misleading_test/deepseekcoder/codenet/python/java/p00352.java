<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000

Expected output:
1968

```
a,b=map(int,input().split())
print((a+b)//2)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a + b) / 2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the average of these two integers and prints the result. The division operation in Java is integer division when both operands are integers, so the result will be an integer as well.
<|EOT|>
