<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 9

Expected output:
8


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

In this Python code, we use the `sys.stdin` and `sys.stdout` to read from the standard input and write to the standard output. The `readline()` method is used to read a line from the input, and `split()` is used to split the line into a list of words. The `map()` function is used to convert each word in the list to an integer. The `min()` function is used to find the smaller of the two numbers. The `write()` method is used to write a string to the output. The `+ '\n'` is used to add a newline character at the end of the string, which is necessary because the `write()` method does not automatically add a newline character.<｜end▁of▁sentence｜>
