<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


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

        List<String> openCases = Arrays.asList("1 1 0", "0 0 1");

        if (openCases.contains(input)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

This Java code reads the input from the user, checks if the input is in the list of open cases, and prints "Open" if it is, otherwise it prints "Close".<｜end▁of▁sentence｜>
