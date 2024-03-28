<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
-49 1000000000008

```
import java.util.*;

class atcoder_ABC149_B {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long A = Long.parseLong(stdIn.next());
        long B = Long.parseLong(stdIn.next());
        long K = Long.parseLong(stdIn.next());
        long n = A - K;
        
        if (A + B <= K) {
            System.out.println("0 0");
        } else if (n < 0) {
            System.out.println("0 " + (A + B - K));
        } else {
            System.out.println(n + " " + B);
        }
    }
}
```

### Response:
```python
import sys

def solve(A, B, K):
    n = A - K

    if A + B <= K:
        return "0 0"
    elif n < 0:
        return "0 " + str(A + B - K)
    else:
        return str(n) + " " + str(B)

A, B, K = map(int, sys.stdin.readline().split())
print(solve(A, B, K))
```

This Python code reads three integers from the standard input, solves the problem and prints the result. The function `solve` takes three parameters: `A`, `B` and `K`, which are the numbers described in the problem. The function returns a string with the result. The `map` function is used to convert the input string into integers. The `sys.stdin.readline().split()` function reads a line from the standard input and splits it into a list of strings. The `str` function is used to convert the numbers back into strings before concatenating them into the result string.
<|EOT|>
