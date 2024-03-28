<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 0 0 4

Expected output:
4 4 0 0

```
import java.io.*;
import java.util.*;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
        
        if (x1 == x2) {
            int dif = Math.abs(y1 - y2);
            pw.println((x1 + dif) + " " + y1 + " " + (x1 + dif) + " " + y2);
        } else if (y1 == y2) {
            int dif = Math.abs(x1 - x2);
            pw.println((x1) + " " + (y1 + dif) + " " + (x2) + " " + (y2 + dif));
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            pw.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {
            pw.println(-1);
        }
        
        pw.close();
    }
    
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}
```

### Response:
```python
import sys

def solve():
    x1, y1, x2, y2 = map(int, sys.stdin.readline().split())

    if x1 == x2:
        dif = abs(y1 - y2)
        print(x1 + dif, y1, x1 + dif, y2)
    elif y1 == y2:
        dif = abs(x1 - x2)
        print(x1, y1 + dif, x2, y2 + dif)
    elif abs(x1 - x2) == abs(y1 - y2):
        print(x1, y2, x2, y1)
    else:
        print(-1)

solve()
```

This Python code reads the input from the standard input, splits it into four integers, and then checks if the points are on the same line. If they are, it prints the coordinates of the rectangle that can be created by the points. If they are not on the same line, it prints -1.
<|EOT|>
