<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
Yes


```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
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
        int d = scanner.nextInt();

        System.out.println((Math.abs(a - c) <= d || Math.abs(a - b) <= d && Math.abs(b - c) <= d) ? "No" : "Yes");
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, and then checks if the conditions in the Python code are met. If the conditions are not met, it prints "Yes", otherwise it prints "No".<｜end▁of▁sentence｜>
