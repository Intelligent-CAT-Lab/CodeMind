<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


```
import java.util.Scanner;

public class p02831 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}
```

### Response:
```python
import sys

def gcd(A, B):
    gcd = 0
    for i in range(1, max(A, B)):
        if A % i == 0 and B % i == 0:
            gcd = i
    return gcd

def lcm(A, B):
    return A * B // gcd(A, B)

A, B = map(int, sys.stdin.readline().split())
print(lcm(A, B))
```

In this Python code, we define two functions `gcd` and `lcm` to calculate the greatest common divisor and least common multiple respectively. The `gcd` function iterates over the range from 1 to the maximum of A and B, and returns the greatest number that both A and B are divisible by. The `lcm` function calculates the least common multiple by dividing the product of A and B by their greatest common divisor. The main part of the code reads two integers from the standard input, calculates their least common multiple using the `lcm` function, and prints the result.
<|EOT|>
