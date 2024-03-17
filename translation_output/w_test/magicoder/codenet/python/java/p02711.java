<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
117

Expected output:
Yes


```
N = input()

if "7" in N:
    print("Yes")
else:
    print("No")
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (String.valueOf(N).contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads an integer from the standard input, converts it to a string, and checks if the string contains the character '7'. If it does, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
