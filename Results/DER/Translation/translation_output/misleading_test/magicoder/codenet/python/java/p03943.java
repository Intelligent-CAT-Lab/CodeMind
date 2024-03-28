<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10 30 20

Expected output:
Yes"

```
a, b, c = map(int, input().split())

ans = "No"
if a + b == c:
  ans = "Yes"
if a + c == b:
  ans = "Yes"
if b + c == a:
  ans = "Yes"

print(ans)
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
        int c = scanner.nextInt();

        String ans = "No";
        if (a + b == c) {
            ans = "Yes";
        } else if (a + c == b) {
            ans = "Yes";
        } else if (b + c == a) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the user, checks if any two of them can be added to equal the third, and prints "Yes" if they can, and "No" otherwise.<｜end▁of▁sentence｜>
