<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 2

Expected output:
-42

```
import java.util.Scanner;

public class p03419 {

    private Scanner in = new Scanner(System.in);

    void solve() {
        long n = in.nextLong(), m = in.nextLong();
        if(n == 2 || m == 2) {
            System.out.println(0);
            return;
        }
        long ans = Math.max(1, n - 2) * Math.max(1, m - 2);
        System.out.println(ans);
    }
    public static void main(String[] args) {
        new p03419().solve();
    }
}
```

### Response:
```python
import sys

def solve():
    n, m = map(int, sys.stdin.readline().split())
    if n == 2 or m == 2:
        print(0)
        return
    ans = max(1, n - 2) * max(1, m - 2)
    print(ans)

if __name__ == "__main__":
    solve()
```

In this Python code, we use the `sys.stdin.readline()` function to read the input from the standard input. The `map()` function is used to convert the input strings to integers. The `max()` function is used to get the maximum of two numbers. The `print()` function is used to output the result.
<|EOT|>
