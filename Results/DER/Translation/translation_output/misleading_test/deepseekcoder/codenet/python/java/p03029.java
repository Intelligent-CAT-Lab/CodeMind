<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 3

Expected output:
-52

```
a, p = list(map(int, input().split()))
print((3*a+p)//2)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int p = scanner.nextInt();
        System.out.println((3*a+p)/2);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the expression ```(3*a+p)/2```, and prints the result. The division in Java is integer division when both operands are integers, so the ```//``` operator is replaced with ```/```.
<|EOT|>
