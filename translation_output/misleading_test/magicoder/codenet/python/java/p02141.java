<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6000 5000 20 10 400 300

Expected output:
-21.71282545948924

```
def inpl(): return list(map(int, input().split()))
W, H, w, h, x, y = inpl()

a = (min(W//2 , x + w//2) + max(-W//2, x-w//2))
b = (min(H//2 , y + h//2) + max(-H//2, y-h//2))
print(b/a)

```

@@ Response
Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        double a = Math.min(W / 2.0, x + w / 2.0) + Math.max(-W / 2.0, x - w / 2.0);
        double b = Math.min(H / 2.0, y + h / 2.0) + Math.max(-H / 2.0, y - h / 2.0);
        System.out.println(b / a);
    }
}
```

This Java code does the same thing as the Python code. It reads six integers from the standard input, calculates the value of `a` and `b`, and then prints the result of `b / a`.<｜end▁of▁sentence｜>
