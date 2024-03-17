<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

def solve(n, a, b):
    return min(a * n, b)

def main():
    n, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, a, b))

if __name__ == '__main__':
    main()
```
<|endoftext|>
