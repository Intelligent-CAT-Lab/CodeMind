<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x = int ( input ( ) )
if x == 1 :
    print ( 0 )
else :
    print ( 1 )


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x == 1) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, checks if it's equal to 1, and then prints 0 if it is, or 1 if it's not.<｜end▁of▁sentence｜>
