<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print(input()[:3])
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() >= 3) {
            System.out.println(input.substring(0, 3));
        } else {
            System.out.println(input);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, and then prints the first three characters of that line. If the input is shorter than three characters, it prints the entire input.<｜end▁of▁sentence｜>
