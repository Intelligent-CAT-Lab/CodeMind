<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
99992

Expected output:
311

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeforces_622_A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(br.readLine());
        long n = (long) ((Math.sqrt(1 + (8 * n1)) - 1) / 2);
        long ans = n1 - (((n + 1) * n) / 2);
        System.out.print((ans != 0) ? ans : n);
    }
}
```

### Response:
```python
import math

def solve(n1):
    n = (math.sqrt(1 + (8 * n1)) - 1) // 2
    ans = n1 - ((n + 1) * n) // 2
    return ans if ans != 0 else n

n1 = int(input())
print(solve(n1))
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the value of `n` and `ans` as per the formula in the Java code, and then prints `ans` if it is not zero, otherwise it prints `n`.
<|EOT|>
