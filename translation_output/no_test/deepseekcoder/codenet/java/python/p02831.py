<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

A = int(sys.stdin.readline().strip())
B = int(sys.stdin.readline().strip())

print(lcm(A, B))
```

This Python code does the same thing as the Java code. It reads two long integers from the standard input, calculates their greatest common divisor (gcd) and least common multiple (lcm), and prints the lcm. The gcd is calculated by iterating over the numbers from 1 to the maximum of the two input numbers and checking if they are divisors of both input numbers. The lcm is calculated by dividing the product of the two input numbers by their gcd.
<|EOT|>
