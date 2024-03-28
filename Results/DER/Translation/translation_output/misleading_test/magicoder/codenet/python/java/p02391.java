<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
a

```
a,b = map(int, input().split())
if a < b:
    print('a < b')
elif a > b:
    print('a > b')
else:
    print('a == b')

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println('a' + " < " + 'b');
        } else if (a > b) {
            System.out.println('a' + " > " + 'b');
        } else {
            System.out.println('a' + " == " + 'b');
        }
    }
}
```

This Java code reads two integers from the standard input (console), and then compares them. It prints the result of the comparison.

Test input:
1 2

Expected output:
a < b<｜end▁of▁sentence｜>
