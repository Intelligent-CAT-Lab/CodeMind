<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

This Python code does the same thing as the Java code. It reads integers from the standard input (stdin), and for each line, it splits the line into two integers H and R. It then checks the conditions in the Java code and prints the corresponding output.<｜end▁of▁sentence｜>
