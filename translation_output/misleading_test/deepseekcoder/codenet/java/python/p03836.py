<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 2

Expected output:
UUDDLLUUURRDRDDDLLU

```
import java.util.Arrays;
import java.util.Scanner;

public class p03836 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sx = sc.nextInt();
        int sy = sc.nextInt();
        int tx = sc.nextInt();
        int ty = sc.nextInt();

        System.out.println( solve(sx, sy, tx, ty) );
    }

    private static String solve(int sx, int sy, int tx, int ty) {
        int dx = tx - sx;
        int dy = ty - sy;

        StringBuilder b = new StringBuilder();
        // sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
        // first
        b.append( renzoku('R', dx) );
        b.append( renzoku('U', dy) );

        // second
        b.append( renzoku('L', dx) );
        b.append( renzoku('D', dy) );

        // third
        b.append( renzoku('D', 1) );
        b.append( renzoku('R', dx + 1) );
        b.append( renzoku('U', dy + 1) );
        b.append( renzoku('L', 1) );

        // forth
        b.append( renzoku('U', 1) );
        b.append( renzoku('L', dx + 1) );
        b.append( renzoku('D', dy + 1) );
        b.append( renzoku('R', 1) );

        return b.toString();
    }

    private static String renzoku(char c, int n) {
        char[] chars = new char[n];
        Arrays.fill(chars, c);
        return new String(chars);
    }
}

```

### Response:
```python
def main():
    sx, sy, tx, ty = map(int, input().split())
    print(solve(sx, sy, tx, ty))

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    b = []
    # sx < tx, sy < ty ならば 移動する
    # first
    b.append(renzoku('R', dx))
    b.append(renzoku('U', dy))

    # second
    b.append(renzoku('L', dx))
    b.append(renzoku('D', dy))

    # third
    b.append(renzoku('D', 1))
    b.append(renzoku('R', dx + 1))
    b.append(renzoku('U', dy + 1))
    b.append(renzoku('L', 1))

    # forth
    b.append(renzoku('U', 1))
    b.append(renzoku('L', dx + 1))
    b.append(renzoku('D', dy + 1))
    b.append(renzoku('R', 1))

    return "".join(b)

def renzoku(c, n):
    return c * n

main()
```
<|EOT|>
