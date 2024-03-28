<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() == 2) {
            System.out.println(input);
        } else {
            String reversed = new StringBuilder(input).reverse().toString();
            System.out.println(reversed);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, checks if the length of the string is 2, and if so, prints the string. If the length is not 2, it reverses the string and prints it.<｜end▁of▁sentence｜>
