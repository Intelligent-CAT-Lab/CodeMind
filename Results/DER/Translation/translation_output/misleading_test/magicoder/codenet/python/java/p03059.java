<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5 7

Expected output:
14

```
a, b, t = map(int, input().split())
print((t // a) * b)
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
        int t = scanner.nextInt();
        scanner.close();

        System.out.println((t / a) * b);
    }
}
```

This Java code reads three integers from the standard input (console), calculates the result as in the Python code, and then prints it.

You can test this code with the following test input:

```
3 5 7
```

And it should print:

```
14
```<｜end▁of▁sentence｜>
