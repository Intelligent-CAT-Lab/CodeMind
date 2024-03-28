<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
11 2

Expected output:
0

```
n,k = map(int, input().split())
i = 0

while n//k**i != 0:
    i += 1

print(i)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int i = 0;

        while (n / Math.pow(k, i) != 0) {
            i++;
        }

        System.out.println(i);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the power of k and checks if the division of n by this power is not equal to zero. If it is not, it increments the counter i and continues the loop. When the division is equal to zero, it prints the value of i.<｜end▁of▁sentence｜>
