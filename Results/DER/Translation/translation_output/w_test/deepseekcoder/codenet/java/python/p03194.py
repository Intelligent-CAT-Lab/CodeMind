<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


```
import java.util.*;

class p03194{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long res = 1;
		for (int i = 2; Math.pow(i, n) <= p; i++) {
			if (p % Math.pow(i, n) == 0) res = i;
		}
		System.out.println(res);
	}
}

```

### Response:
```python
import math

def p03194():
    n, p = map(int, input().split())
    if n == 1:
        return p
    res = 1
    for i in range(2, int(math.pow(p, 1/n))+1):
        if p % math.pow(i, n) == 0:
            res = i
    return res

print(p03194())
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if the first one is 1, and if so, returns the second integer. If the first integer is not 1, it calculates the smallest integer `i` such that `i^n` is a divisor of the second integer. The result is printed to the standard output.
<|EOT|>
