<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
B

Expected output:
A


```
n = input()

if n.isupper():
    print("A")
elif n.islower():
    print("a")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        if (n.matches("[A-Z]")) {
            System.out.println("A");
        } else if (n.matches("[a-z]")) {
            System.out.println("a");
        }
    }
}
```

This Java code reads a character from the standard input, checks if it's uppercase or lowercase, and prints "A" or "a" accordingly.<｜end▁of▁sentence｜>
