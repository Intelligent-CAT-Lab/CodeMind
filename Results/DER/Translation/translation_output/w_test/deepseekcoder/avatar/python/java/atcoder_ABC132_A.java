<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        s = new String(chars);

        if (s.charAt(0) == s.charAt(1) && s.charAt(2) == s.charAt(3) && s.charAt(0) != s.charAt(2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads a string from the user, converts it to a character array, sorts the array, and then checks if the first two characters are the same and the third and fourth characters are the same and they are not the same. If all these conditions are met, it prints "Yes", otherwise it prints "No".
<|EOT|>
