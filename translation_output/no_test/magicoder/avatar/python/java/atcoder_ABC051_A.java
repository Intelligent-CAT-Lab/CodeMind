<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print ( input ( ) . replace ( " , " , " â " ) )


```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = input.replace(", ", " â ");
        System.out.println(output);
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, replaces all occurrences of ", " with " â ", and then prints the result.<｜end▁of▁sentence｜>
