<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 2

Expected output:
URDDLLUUURRDRDDDLLU

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
[/INST]
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

        String order = "L";

        order += "U";
        for (int i = 1; i <= y; i++) {
            order += "U";
        }
        order += "R";
        for (int i = 1; i <= x; i++) {
            order += "R";
        }
        order += "D";

        order += "R";
        order += "D";
        for (int i = 1; i <= y; i++) {
            order += "D";
        }
        order += "L";
        for (int i = 1; i <= x; i++) {
            order += "L";
        }
        order += "U";

        order += "U";
        for (int i = 0; i < y; i++) {
            order += "U";
        }
        order += "R";
        for (int i = 0; i < x; i++) {
            order += "R";
        }
        order += "D";
        for (int i = 0; i < y; i++) {
            order += "D";
        }
        order += "L";
        for (int i = 0; i < x; i++) {
            order += "L";
        }

        System.out.println(order);
    }
}
```</s>
