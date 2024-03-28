<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
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

This Java code does the same thing as the Python code. It reads an integer from the input, divides it by 100 to get the quotient and the remainder, and then checks if the remainder is less than or equal to the product of the quotient and 5. If it is, it prints 1; otherwise, it prints 0.
<|EOT|>
