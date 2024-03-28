<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ABA

Expected output:
Yes


```
S = str(input())

if S == 'AAA' or S == 'BBB':
    print('No')
else:
    print('Yes')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();

        if (S.equals("AAA") || S.equals("BBB")) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user input, and then checks if the string is either "AAA" or "BBB". If it is, it prints "No". Otherwise, it prints "Yes".<｜end▁of▁sentence｜>
