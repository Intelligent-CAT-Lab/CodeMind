<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long even = (long)n * (n-1) / 2;
        long odd = (long)m * (m-1) / 2;

        System.out.println(even + odd);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the input, calculates the number of even and odd pairs, and then prints the sum of these two numbers. The division is performed using integer division, so the result is always an integer.
<|EOT|>
