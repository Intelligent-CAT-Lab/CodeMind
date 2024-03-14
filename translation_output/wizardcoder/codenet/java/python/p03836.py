Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import java.util.Arrays
import java.util.Scanner

class p03836:

    def main(self):
        sc = Scanner(System.in)
        sx = sc.nextInt()
        sy = sc.nextInt()
        tx = sc.nextInt()
        ty = sc.nextInt()

        print( self.solve(sx, sy, tx, ty) )

    def solve(self, sx, sy, tx, ty):
        dx = tx - sx
        dy = ty - sy

        b = StringBuilder()
        # sx < tx, sy < ty ãªã®ã§ ç¹å®ã®å½¢å¼ã§è¡ãã
        # first
        b.append( self.renzoku('R', dx) )
        b.append( self.renzoku('U', dy) )

        # second
        b.append( self.renzoku('L', dx) )
        b.append( self.renzoku('D', dy) )

        # third
        b.append( self.renzoku('D', 1) )
        b.append( self.renzoku('R', dx + 1) )
        b.append( self.renzoku('U', dy + 1) )
        b.append( self.renzoku('L', 1) )

        # forth
        b.append( self.renzoku('U', 1) )
        b.append( self.renzoku('L', dx + 1) )
        b.append( self.renzoku('D', dy + 1) )
        b.append( self.renzoku('R', 1) )

        return b.toString()

    def renzoku(self, c, n):
        chars = [c] * n
        return ''.join(chars)

p03836().main()
```<|endoftext|>
