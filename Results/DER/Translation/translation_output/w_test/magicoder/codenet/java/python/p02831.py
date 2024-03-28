<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

def calculate_lcm(A, B):
    gcd = math.gcd(A, B)
    lcm = A * B // gcd
    return lcm

A, B = map(int, input().split())
print(calculate_lcm(A, B))
```

In the Python code, we use the `math.gcd()` function to calculate the greatest common divisor (gcd) of `A` and `B`. Then, we calculate the least common multiple (lcm) by dividing the product of `A` and `B` by the gcd. The `map(int, input().split())` line reads the input from the user and splits it into two integers. The `calculate_lcm()` function is then called with these two integers as arguments. The result is printed to the console.<｜end▁of▁sentence｜>
