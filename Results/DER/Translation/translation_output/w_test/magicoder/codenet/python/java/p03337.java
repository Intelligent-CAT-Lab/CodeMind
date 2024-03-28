<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1

Expected output:
4


```
a,b=map(int,input().split())
print(max(a+b,a-b,a*b))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        int max = Math.max(a + b, Math.max(a - b, a * b));
        System.out.println(max);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the maximum of the sum, difference, and product of the two integers, and then prints the result.<｜end▁of▁sentence｜>
