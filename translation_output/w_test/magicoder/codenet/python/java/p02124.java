<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
print("ai1333" + "3" * int(int(input()) / 100))

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "ai1333";
        output += "3".repeat(input / 100);
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, divides it by 100, and uses the result to repeat the string "3". The result is then concatenated with the string "ai1333" and printed out.<｜end▁of▁sentence｜>
