<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
15 16


```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print((a * b) + " " + ((a + b) * 2));
    }
}
```

This Java code reads two integers from the standard input, calculates the product of the two numbers and the sum of the two numbers, and then prints the results. The results are separated by a space.
<|EOT|>
