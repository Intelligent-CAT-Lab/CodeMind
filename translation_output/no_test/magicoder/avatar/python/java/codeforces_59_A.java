<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
txt = input ( )
out = " "
cap = 0
small = 0
for t in txt :
    if t . islower ( ) :
        small += 1
    else :
        cap += 1
if small >= cap :
    for t in txt :
        out += t . lower ( )
else :
    for t in txt :
        out += t . upper ( )
print ( out )


```

@@ Response
Here is the equivalent Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine();
        String out = "";
        int cap = 0;
        int small = 0;
        for (int i = 0; i < txt.length(); i++) {
            char t = txt.charAt(i);
            if (Character.isLowerCase(t)) {
                small += 1;
            } else {
                cap += 1;
            }
        }
        if (small >= cap) {
            for (int i = 0; i < txt.length(); i++) {
                char t = txt.charAt(i);
                out += Character.toLowerCase(t);
            }
        } else {
            for (int i = 0; i < txt.length(); i++) {
                char t = txt.charAt(i);
                out += Character.toUpperCase(t);
            }
        }
        System.out.println(out);
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of lowercase and uppercase letters, and then converts all letters to lowercase if the number of lowercase letters is greater than or equal to the number of uppercase letters, and to uppercase otherwise.<｜end▁of▁sentence｜>
