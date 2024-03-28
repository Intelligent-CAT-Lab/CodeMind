<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE=

```
print(str(input())[:-8])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(input.substring(0, input.length() - 8));
    }
}
```

You can test this code with the following test case:

Test input:
CODEFESTIVAL

Expected output:
CODE=<｜end▁of▁sentence｜>
