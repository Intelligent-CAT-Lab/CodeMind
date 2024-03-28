<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
5

```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long s = a - b;
		long count = Math.max(x - a, 0) / s;
		long total = (count % MOD) * (a % MOD) % MOD;
		x -= count * s;
		while (x >= a) {
		    total += a;
		    x += - a + b;
		}
		total += x;
		total %= MOD;
		System.out.println(total);
	}
}


```

### Response:
```python
import sys

MOD = 1000000007

def solve(a, b, x):
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    return total

def main():
    a, b, x = map(int, sys.stdin.readline().split())
    print(solve(a, b, x))

if __name__ == "__main__":
    main()
```

In this Python code, the function `solve(a, b, x)` is equivalent to the `main` method in the Java code. The `main` function reads the input from the standard input, calls the `solve` function with the input parameters, and prints the result. The `solve` function calculates the result according to the logic in the Java code.
<|EOT|>
