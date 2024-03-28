<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-3 3

Expected output:
-25

```
import java.util.Scanner;

public class p00331 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int H = sc.nextInt();
            int R = sc.nextInt();

            if ( H < 0 && Math.abs(H) == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


```

@@ Response
```python
import sys

for line in sys.stdin:
    H, R = map(int, line.split())

    if H < 0 and abs(H) == R:
        print(0)
    elif H + R > 0:
        print(1)
    else:
        print(-1)
```

This Python code reads from the standard input (stdin), splits each line into two integers (H and R), and then checks the conditions as in the Java code. The result is printed to the standard output (stdout).<｜end▁of▁sentence｜>
