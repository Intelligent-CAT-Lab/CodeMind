<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import math
n=int(input())
print(math.factorial(n)%1000000007)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long result = factorial(n);
        System.out.println(result % 1000000007);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = (result * i) % 1000000007;
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the factorial of that number, and then prints the result modulo 1000000007. The factorial function is implemented using a loop, and the result is updated in each iteration to avoid overflow.<｜end▁of▁sentence｜>
