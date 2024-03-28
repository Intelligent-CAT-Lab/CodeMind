<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
c

Expected output:
d


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
        char input = scanner.next().charAt(0);
        char output = (char)(input + 1);
        System.out.println(output);
    }
}
```

In this Java code, we use the `Scanner` class to read the input from the user. The `next().charAt(0)` method is used to read the first character of the input string. Then, we convert the character to its ASCII value using `(int)` and increment it by 1. Finally, we convert the result back to a character using `(char)` and print it.

You can test this code with the following test case:

Test input:
c

Expected output:
d<｜end▁of▁sentence｜>
