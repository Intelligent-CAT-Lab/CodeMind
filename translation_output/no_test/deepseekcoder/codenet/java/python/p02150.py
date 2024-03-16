<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

def main():
    a = int(sys.stdin.readline().strip())
    b = int(sys.stdin.readline().strip())
    x = int(sys.stdin.readline().strip())
    s = a - b
    count = max(x - a, 0) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three long integers from the standard input, calculates the number of times the difference between the two numbers can be subtracted from the third number, and prints the result modulo 1,000,000,007.
<|EOT|>
