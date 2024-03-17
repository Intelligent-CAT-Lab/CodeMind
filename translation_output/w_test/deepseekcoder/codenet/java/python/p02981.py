<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(is, os):
    n, a, b = map(int, is.readline().split())
    os.write(str(min(a * n, b)) + '\n')

def main():
    solve(sys.stdin, sys.stdout)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `readline()` method to read the input from the standard input (`sys.stdin`), and the `write()` method to write the output to the standard output (`sys.stdout`). The `map()` function is used to convert the input strings to integers. The `min()` function is used to find the minimum of the two numbers.
<|EOT|>
