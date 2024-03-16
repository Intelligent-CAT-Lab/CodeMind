<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print("ai1333" + "3" * int(int(input()) / 100))

```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int division = input / 100;
        String result = "ai1333" + "3".repeat(division);
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, divides it by 100, and then repeats the string "3" that many times. The result is then concatenated with the string "ai1333" and printed.<｜end▁of▁sentence｜>
