<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def solve(sx, sy, tx, ty):
    dx = tx - sx
    dy = ty - sy

    # first
    b = 'R' * dx + 'U' * dy

    # second
    b += 'L' * dx + 'D' * dy

    # third
    b += 'D' + 'R' * (dx + 1) + 'U' * (dy + 1) + 'L'

    # forth
    b += 'U' + 'L' * (dx + 1) + 'D' * (dy + 1) + 'R'

    return b

if __name__ == '__main__':
    sx, sy, tx, ty = map(int, sys.stdin.readline().split())
    print(solve(sx, sy, tx, ty))
```
This is the Python code that translates the Java code you provided. It uses the `map` function to read the input from the standard input and split it into four integers, and then it calls the `solve` function with those four integers as arguments. The `solve` function calculates the difference between the starting and ending coordinates, and then it uses string concatenation to build the final string that represents the path. Finally, it returns the string to the main function, which prints it to the standard output.</s>
