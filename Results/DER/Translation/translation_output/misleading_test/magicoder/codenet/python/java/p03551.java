<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1

Expected output:
3900

```
N,M = list(map(int,input().split()))
time = 1900*M+(N-M)*100
print(time*(2**M))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();

        int time = 1900*M + (N-M)*100;
        System.out.println(time * Math.pow(2, M));
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the time as per the given formula, and then prints the result. The `Math.pow(2, M)` function is used to calculate 2 to the power of M.<｜end▁of▁sentence｜>
