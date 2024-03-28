<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();
        int x = tx - sx;
        int y = ty - sy;
        String order = "";
        order += "U"*(y+1);
        order += "R"*(x+1);
        order += "D";
        order += "R";
        order += "D"*(y+1);
        order += "L"*(x+1);
        order += "U";
        order += "U"*y;
        order += "R"*x;
        order += "D"*y;
        order += "L"*x;
        System.out.println(order);
    }
}
```
<|endoftext|>
