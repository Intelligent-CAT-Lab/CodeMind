<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

        if (n.equals(n.toUpperCase())) {
            System.out.println("A");
        } else if (n.equals(n.toLowerCase())) {
            System.out.println("a");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, checks if the input is all uppercase or all lowercase, and prints "A" or "a" accordingly.<｜end▁of▁sentence｜>
