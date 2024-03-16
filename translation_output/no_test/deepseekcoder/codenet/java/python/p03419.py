<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

class p03419:

    def __init__(self):
        self.n, self.m = map(int, sys.stdin.readline().split())

    def solve(self):
        if self.n == 2 or self.m == 2:
            print(0)
            return
        print(max(1, self.n - 2) * max(1, self.m - 2))

p03419().solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if either of them is 2, and if so, prints 0. Otherwise, it calculates the maximum of `(n-2)` and `1`, and the maximum of `(m-2)` and `1`, and multiplies these two results together. The result is printed to the standard output.
<|EOT|>
