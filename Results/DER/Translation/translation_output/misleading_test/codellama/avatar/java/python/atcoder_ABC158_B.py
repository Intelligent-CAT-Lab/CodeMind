<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
501719768609305159 370614275896614890 131105492712690269

Expected output:
370614275896614948

```
import java.util.*;

class atcoder_ABC158_B {
    public static void main(String[] args) {
        new Solver().run();
    }
}

class Solver {
    public void run() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        long base = N / (A + B);
        long mod = N % (A + B);
        if (mod >= A)
            mod = A;
        System.out.println(base * A + mod);
        return;
    }
}
```
[/INST]
```python
import sys

def solve(N, A, B):
    base = N // (A + B)
    mod = N % (A + B)
    if mod >= A:
        mod = A
    return base * A + mod

if __name__ == "__main__":
    N, A, B = map(int, sys.stdin.readline().split())
    print(solve(N, A, B))
```
This is a Python implementation of the provided Java code. The `solve()` function takes three integers as input: `N`, `A`, and `B`, and returns the result of the calculation. The `if __name__ == "__main__":` block is used to run the `solve()` function with the input from stdin.

Note that the `//` operator in Python is used for integer division, which is equivalent to the `floor()` function in Java. The `%` operator in Python is used for modulo division, which is equivalent to the `mod()` function in Java.</s>
