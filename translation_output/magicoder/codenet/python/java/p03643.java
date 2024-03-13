<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = str(input())
print("ABC"+s)
```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println("ABC" + s);
    }
}
```

In this Java code, we use the `Scanner` class to read input from the user. The `nextLine()` method is used to read a line of input from the user. The input string is then concatenated with "ABC" and printed.<｜end▁of▁sentence｜>
