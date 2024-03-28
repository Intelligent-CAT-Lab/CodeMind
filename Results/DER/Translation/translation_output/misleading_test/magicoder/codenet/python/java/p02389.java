<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 5

Expected output:
16

```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

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

        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }
}
```

This Java code reads two integers from the standard input (console), calculates the product of the two numbers and the sum of the two numbers multiplied by 2, and then prints the results.

You can test this code with the following test input:

```
3 5
```

And the expected output will be:

```
15
16
```<｜end▁of▁sentence｜>
