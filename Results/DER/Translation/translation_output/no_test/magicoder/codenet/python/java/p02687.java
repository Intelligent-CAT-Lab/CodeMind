<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
string = input()
if string == "ARC":
  print("ABC")
else:
  print("ARC")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        if (string.equals("ARC")) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the string is "ARC", and then prints "ABC" if it is, or "ARC" if it's not.<｜end▁of▁sentence｜>
