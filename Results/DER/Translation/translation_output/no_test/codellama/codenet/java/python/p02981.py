<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def solve(n, a, b):
    return min(a * n, b)

if __name__ == "__main__":
    n, a, b = map(int, sys.stdin.readline().split())
    print(solve(n, a, b))
```
This is a simple program that reads three integers `n`, `a`, and `b` from standard input, and then calculates the minimum of `a * n` and `b`. The result is then printed to standard output.

The `map` function is used to convert the input string into a list of integers, and the `min` function is used to find the minimum of the two values.

The `if __name__ == "__main__":` block is used to indicate that the code should only be executed when the file is run as a script, rather than when it is imported as a module.</s>
