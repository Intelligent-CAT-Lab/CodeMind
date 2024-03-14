<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx = scanner.nextInt();
        int sy = scanner.nextInt();
        int tx = scanner.nextInt();
        int ty = scanner.nextInt();

        StringBuilder order = new StringBuilder();

        int x = tx - sx;
        int y = ty - sy;

        for (int i = 0; i < y; i++) {
            order.append("U");
        }
        for (int i = 0; i < x; i++) {
            order.append("R");
        }
        order.append("D");

        for (int i = 0; i < y; i++) {
            order.append("D");
        }
        for (int i = 0; i < x; i++) {
            order.append("L");
        }
        order.append("U");

        for (int i = 0; i < y; i++) {
            order.append("U");
        }
        for (int i = 0; i < x; i++) {
            order.append("R");
        }
        order.append("D");

        for (int i = 0; i < y; i++) {
            order.append("D");
        }
        for (int i = 0; i < x; i++) {
            order.append("L");
        }
        order.append("U");

        System.out.println(order.toString());
    }
}
```

This Java code does the same thing as the Python code. It reads four integers from the input, calculates the differences between the source and target coordinates, and then generates a string of commands to move from the source to the target. The commands are appended to a `StringBuilder` object, which is then converted to a string and printed.
<|EOT|>
