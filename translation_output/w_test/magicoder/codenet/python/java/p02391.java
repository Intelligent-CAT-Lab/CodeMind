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

This Java code does the same thing as the Python code you provided. It reads two integers from the user, compares them, and prints the result. The `Scanner` class is used to read the input from the user, and the `System.out.println` method is used to print the result.<｜end▁of▁sentence｜>
