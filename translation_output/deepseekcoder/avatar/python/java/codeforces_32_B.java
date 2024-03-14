<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
Here is the Java version of your Python code:

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
                i += 1;
                if (s.charAt(i) == '.') {
                    result += '1';
                } else {
                    result += '2';
                }
            }
            i += 1;
        }
        System.out.println(result);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the user, then iterates over each character in the string. If the character is a '.', it adds '0' to the result string. If the character is not a '.', it checks the next character. If the next character is a '.', it adds '1' to the result string. Otherwise, it adds '2'. The result string is then printed out.
<|EOT|>
