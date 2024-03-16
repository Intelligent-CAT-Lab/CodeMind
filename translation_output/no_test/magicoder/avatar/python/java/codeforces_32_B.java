<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input ( )
result = " "
i = 0
while i < len ( s ) :
    if s [ i ] == " . " :
        result += '0'
    else :
        i += 1
        if s [ i ] == " . " :
            result += '1'
        else :
            result += '2'
    i += 1
print ( result )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '.') {
                result += '0';
            } else {
                i++;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i++;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, then iterates over each character in the string. If the character is a '.', it appends '0' to the result string. If the character is not a '.', it increments the index and checks the next character. If the next character is a '.', it appends '1' to the result string. If the next character is not a '.', it appends '2' to the result string. The index is then incremented again. The result string is then printed out.<｜end▁of▁sentence｜>
