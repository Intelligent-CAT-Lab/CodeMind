<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
1


```
n = int(input())

print((n-1)*n//2)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n-1)*n/2);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the standard input, calculates the sum of all numbers from 1 to n-1 (which is equivalent to the sum of the first n natural numbers minus 1), and then prints the result.<｜end▁of▁sentence｜>
