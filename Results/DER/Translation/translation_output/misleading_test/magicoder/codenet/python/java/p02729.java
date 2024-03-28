<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1

Expected output:
73

```
n,m = map(int,input().split())

even = n * (n-1) // 2
odd = m * (m-1) // 2

print(even + odd)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long even = n * (long)(n-1) / 2;
        long odd = m * (long)(m-1) / 2;

        System.out.println(even + odd);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the number of even and odd numbers, and then prints the sum of these two numbers.

Please note that in Java, integer division (/) rounds down to the nearest whole number, so we need to use long integers to avoid overflow. Also, the Scanner class is used to read the input from the standard input.<｜end▁of▁sentence｜>
