<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sx, sy, tx, ty;
        sx = scanner.nextInt();
        sy = scanner.nextInt();
        tx = scanner.nextInt();
        ty = scanner.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String order = "L";
        order += "U".repeat(y + 1);
        order += "R".repeat(x + 1);
        order += "D";
        order += "R".repeat(y + 1);
        order += "D".repeat(y + 1);
        order += "L".repeat(x + 1);
        order += "U".repeat(y);
        order += "R".repeat(x);
        order += "D".repeat(y);
        order += "L".repeat(x);
        System.out.println(order);
    }
}
```</s>
