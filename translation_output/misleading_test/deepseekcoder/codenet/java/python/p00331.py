<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(H, R):
    if H < 0 and abs(H) == R:
        return 0
    elif H + R > 0:
        return 1
    else:
        return -1

for line in sys.stdin:
    H, R = map(int, line.split())
    print(solve(H, R))
```

This Python code reads integers from the standard input (stdin), and for each pair of integers, it prints the result of the `solve` function. The `solve` function implements the logic of the original Java code.
<|EOT|>
