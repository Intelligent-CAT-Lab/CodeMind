<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 6

Expected output:
-28

```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int c = scanner.nextInt();

        if (s * 2 <= c) {
            System.out.println(s + ((c - s * 2) / 4));
        } else {
            System.out.println(c / 2);
        }
    }
}
```

This Java code reads two integers from the standard input (System.in), and then checks if `s * 2` is less than or equal to `c`. If it is, it calculates `s + ((c - s * 2) / 4)` and prints the result. If `s * 2` is not less than or equal to `c`, it calculates `c / 2` and prints the result.<｜end▁of▁sentence｜>
