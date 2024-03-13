<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
if '9' in input():
    print('Yes')
else:
    print('No')
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.contains("9")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, and then checks if the string contains the character '9'. If it does, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
