<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 3 4

Expected output:
32

```
n,a,b = map(int,input().split())

k = n//(a+b)
p = n%(a+b)

print(k*a + min(p,a))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int k = n / (a + b);
        int p = n % (a + b);

        System.out.println(k * a + Math.min(p, a));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, calculates the quotient and remainder of the division of the first by the sum of the second and third, and then prints the product of the quotient and the second integer plus the minimum of the remainder and the second integer.
<|EOT|>
