<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
stdin = input ( )
s = stdin
result = " Yes " if " A " in s and " B " in s else " No "
print ( result )


```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = (s.contains(" A ") && s.contains(" B ")) ? " Yes " : " No ";
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, checks if the string `s` contains both " A " and " B ", and then prints " Yes " if it does, otherwise it prints " No ".<｜end▁of▁sentence｜>
