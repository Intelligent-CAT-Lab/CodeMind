<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print('2018'+input()[4:])
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("2018" + input.substring(4));
    }
}
```

This Java code does the same thing as the Python code. It prompts the user to input a string, then prints out the string "2018" followed by the substring of the input string starting from the 5th character (index 4, because indices in Java start from 0).<｜end▁of▁sentence｜>
