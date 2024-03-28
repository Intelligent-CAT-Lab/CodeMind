Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import sys

def solve(n, a, b):
    return min(a * n, b)

if __name__ == '__main__':
    n, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, a, b))
```<|endoftext|>
