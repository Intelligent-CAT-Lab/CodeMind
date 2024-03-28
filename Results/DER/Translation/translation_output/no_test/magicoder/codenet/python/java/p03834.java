<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.replace(",", " "))
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.replace(",", " "));
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, replaces all commas with spaces, and then prints the result.<｜end▁of▁sentence｜>
