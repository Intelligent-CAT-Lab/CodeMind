<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
this is a pen.

Expected output:
THIS IS A PEN.


```
a=input().upper()
print(a)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.toUpperCase();
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, converts it to uppercase, and then prints the result.<｜end▁of▁sentence｜>
