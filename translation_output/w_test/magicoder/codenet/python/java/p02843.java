<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
615

Expected output:
1


```
N = int(input())
q, mod = divmod(N, 100)
print(1 if mod <= q * 5 else 0)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int q = N / 100;
        int mod = N % 100;
        System.out.println(mod <= q * 5 ? 1 : 0);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the quotient and the remainder of the division by 100, and then prints 1 if the remainder is less than or equal to the product of the quotient and 5, otherwise it prints 0.<｜end▁of▁sentence｜>
