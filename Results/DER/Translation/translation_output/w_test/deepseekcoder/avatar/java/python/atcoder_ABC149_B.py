<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000 1000000000000 1000000000000

Expected output:
0 1000000000000

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

This Python code reads the input from the standard input, converts it to integers, and passes them to the `solve` function. The `solve` function calculates the values of `n` and `m` as per the Java code, and returns a string containing the results. The result is then printed to the standard output.
<|EOT|>
