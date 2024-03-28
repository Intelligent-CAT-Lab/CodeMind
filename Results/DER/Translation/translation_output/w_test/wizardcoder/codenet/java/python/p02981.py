Below is an instruction that describes a task. Write a response that appropriately completes the request.

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

def solve(n, a, b):
    return min(a * n, b)

if __name__ == '__main__':
    n, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, a, b))
```

Explanation:

- We import the `sys` module to read input from the standard input stream.
- We define a function `solve` that takes three arguments `n`, `a`, and `b`.
- Inside the function, we use the `min` function to return the minimum of `a * n` and `b`.
- In the `if __name__ == '__main__':` block, we read the input from the standard input stream using `map(int, sys.stdin.readline().split())` and call the `solve` function with these arguments.
- Finally, we print the result using `print(solve(n, a, b))`.<|endoftext|>
