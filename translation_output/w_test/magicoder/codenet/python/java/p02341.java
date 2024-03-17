<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 10

Expected output:
1


```
n, k = map(int, input().split())
print(1 if n <= k else 0)

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
        scanner.close();

        System.out.println(n <= k ? 1 : 0);
    }
}
```

This Java code reads two integers from the standard input (console), checks if the first integer is less than or equal to the second one, and prints 1 if the condition is true, otherwise it prints 0.<｜end▁of▁sentence｜>
