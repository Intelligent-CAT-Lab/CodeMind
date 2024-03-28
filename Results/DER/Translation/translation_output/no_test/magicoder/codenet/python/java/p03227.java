<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            String reversed = new StringBuilder(l).reverse().toString();
            System.out.println(reversed);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the length of the string is 2, and if so, prints the string. If the length is not 2, it reverses the string and prints it.<｜end▁of▁sentence｜>
