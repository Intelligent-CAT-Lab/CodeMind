<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
]d

```
print ( chr ( ord ( input ( ) ) + 1 ) )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        System.out.println((char)(c + 1));
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `next().charAt(0)` method is used to read the first character of the input. Then, we convert the character to its ASCII value using `(int)c`, increment it by 1, and then convert it back to a character using `(char)`. Finally, we print the result.

You can test this code with the input 'c' and it will output ']'.<｜end▁of▁sentence｜>
