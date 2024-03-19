<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Op]n

```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<String> options = Arrays.asList("1 1 0", "0 0 1");

        if (options.contains(input)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input from the user, checks if the input is in the list of options, and prints "Open" if it is, or "Close" if it isn't.<｜end▁of▁sentence｜>
