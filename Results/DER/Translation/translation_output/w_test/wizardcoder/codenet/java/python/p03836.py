Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 0 1 2

Expected output:
UURDDLLUUURRDRDDDLLU


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
Here's the Python code that translates the Java code to Python:

```python
import java.util.Arrays
import java.util.Scanner

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    b = ""
    # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
    # first
    b += renzoku('R', dx)
    b += renzoku('U', dy)

    # second
    b += renzoku('L', dx)
    b += renzoku('D', dy)

    # third
    b += renzoku('D', 1)
    b += renzoku('R', dx + 1)
    b += renzoku('U', dy + 1)
    b += renzoku('L', 1)

    # forth
    b += renzoku('U', 1)
    b += renzoku('L', dx + 1)
    b += renzoku('D', dy + 1)
    b += renzoku('R', 1)

    return b

def renzoku(c, n):
    chars = [c] * n
    return "".join(chars)

if __name__ == '__main__':
    sc = Scanner(System.in)
    sx = sc.nextInt()
    sy = sc.nextInt()
    tx = sc.nextInt()
    ty = sc.nextInt()

    print(solve(sx, sy, tx, ty))
```

The Python code is almost the same as the Java code, except for the following changes:

- The `java` package is imported as `java.util.Arrays` and `java.util.Scanner` instead of `java.lang.Arrays` and `java.util.Scanner`.
- The `main` function is defined outside the `p03836` class.
- The `renzoku` function is defined outside the `p03836` class.
- The `System.out.println` statement is replaced with a `print` statement.
- The `StringBuilder` class is not used in Python, so the `b` variable is defined as a string.
- The `Arrays.fill` method is not used in Python, so the `chars` variable is defined as a list of characters and filled with the character `c`.
- The `Arrays.toString` method is not used in Python, so the `chars` variable is converted to a string using the `join` method.<|endoftext|>
