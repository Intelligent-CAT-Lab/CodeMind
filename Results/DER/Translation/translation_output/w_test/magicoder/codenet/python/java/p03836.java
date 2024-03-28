<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 2

Expected output:
UURDDLLUUURRDRDDDLLU


```
sx,sy,tx,ty = map(int,input().split())
x = (tx-sx)
y = (ty-sy)

order = "L"

order += "U"*(y+1)
order += "R"*(x+1)
order += "D"

order += "R"
order += "D"*(y+1)
order += "L"*(x+1)
order += "U"

order += "U"*y
order += "R"*x
order += "D"*y
order += "L"*x
print(order)

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        int x = tx - sx;
        int y = ty - sy;

        StringBuilder order = new StringBuilder();

        order.append("L".repeat(Math.max(0, x + 1)));
        order.append("U".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x + 1)));
        order.append("D".repeat(Math.max(0, y + 1)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x)));
        order.append("U".repeat(Math.max(0, y)));
        order.append("U".repeat(Math.max(0, y)));
        order.append("R".repeat(Math.max(0, x)));
        order.append("D".repeat(Math.max(0, y)));
        order.append("L".repeat(Math.max(0, x)));

        System.out.println(order.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the standard input, calculates the differences between the target and starting coordinates, and then constructs a string of commands to move from the starting point to the target point. The `repeat` method is used to append the same string multiple times.<｜end▁of▁sentence｜>
