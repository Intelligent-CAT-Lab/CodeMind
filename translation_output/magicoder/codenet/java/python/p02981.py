<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

In this Python code, we use the `sys` module to read from `stdin` and write to `stdout`. The `readline()` method is used to read a line from the input stream, and `write()` is used to write a string to the output stream. The `map()` function is used to convert the input string into integers. The `min()` function is used to find the minimum of two numbers. The `str()` function is used to convert the minimum value to a string before writing it to the output stream.<｜end▁of▁sentence｜>
