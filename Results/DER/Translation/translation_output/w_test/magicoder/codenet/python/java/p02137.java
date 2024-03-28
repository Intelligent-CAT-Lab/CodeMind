<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5700

Expected output:
5500


```
print(int(int(input()) // 500 * 500))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num - num % 500);
    }
}
```

This Java code reads an integer from the standard input, then prints the integer divided by 500 and multiplied by 500. The `%` operator is used to get the remainder of the division, which is then subtracted from the original number to get the result.<｜end▁of▁sentence｜>
