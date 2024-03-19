<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 9

Expected output:
38

```
import java.io.InputStream;
import java.io.PrintStream;
import java.util.*;

public class p02981 {

  public static void main(String[] args) {
    solve(System.in, System.out);
  }

  static void solve(InputStream is, PrintStream os) {
    Scanner sc = new Scanner(is);

    /* read */
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    os.println(Math.min(a * n, b));
  }
}
```

@@ Response
```python
import sys

def solve(is, os):
    n, a, b = map(int, is.readline().split())
    os.write(str(min(a * n, b)) + '\n')

if __name__ == "__main__":
    solve(sys.stdin, sys.stdout)
```

In this Python code, we use the `readline()` method to read the input from the standard input (`sys.stdin`), split it into three integers using the `split()` method, and then find the minimum of the product of `a` and `n` and `b`. The result is then written to the standard output (`sys.stdout`).<｜end▁of▁sentence｜>
