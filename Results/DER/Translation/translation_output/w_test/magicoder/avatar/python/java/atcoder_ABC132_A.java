<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
STOP

Expected output:
No


```
s = sorted ( input ( ) )
if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] != s [ 2 ] : print ( ' Yes ' )
else : print ( ' No ' )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        if (chars[0] == chars[1] && chars[2] == chars[3] && chars[0] != chars[2]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, converts it to a character array, sorts the array, and then checks if the first two characters are the same and the last two characters are the same, but not the same as the first two characters. If this is the case, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
