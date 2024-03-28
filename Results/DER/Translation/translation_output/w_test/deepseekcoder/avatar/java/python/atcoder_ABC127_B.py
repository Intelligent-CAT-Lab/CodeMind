<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 2

Expected output:
3
5
9
17
33
65
129
257
513
1025


```
import java.util.*;

class atcoder_ABC127_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());

        for (int i = 0; i < 10; i++) {
            x = r * x - d;
            System.out.println(x);
        }
    }
}
```

### Response:
```python
import sys

def solve():
    r, d, x = map(int, sys.stdin.readline().split())

    for _ in range(10):
        x = r * x - d
        print(x)

if __name__ == "__main__":
    solve()
```

This Python code reads the input from the standard input, and then it calculates the sequence as per the given formula in the Java code. The result is printed on the standard output.
<|EOT|>
