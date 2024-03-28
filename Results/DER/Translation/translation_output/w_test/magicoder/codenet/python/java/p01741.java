<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1.000

Expected output:
2.000000000000


```
n=float(input())
print(n//1+1 if n*2**0.5<n//1+1 else n*2**0.5)
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        double sqrtN = Math.sqrt(n);
        double floorN = Math.floor(n);
        double result = sqrtN < floorN + 1 ? floorN + 1 : sqrtN;
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a double number from the standard input, calculates the square root of the number, rounds it down to the nearest integer, and then checks if the square root is less than the rounded down number plus one. If it is, it prints the rounded down number plus one. Otherwise, it prints the square root.<｜end▁of▁sentence｜>
