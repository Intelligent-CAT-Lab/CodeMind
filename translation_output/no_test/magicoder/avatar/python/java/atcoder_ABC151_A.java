<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char inputChar = scanner.next().charAt(0);
        char outputChar = (char)(inputChar + 1);
        System.out.println(outputChar);
    }
}
```

This Java code does the same thing as the Python code. It reads a character from the user, increments it by one, and then prints the result.<｜end▁of▁sentence｜>
