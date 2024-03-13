<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

A, B = map(int, input().split())

gcd = math.gcd(A, B)
lcm = A * B // gcd

print(lcm)
```

In Python, the equivalent code would be:

1. Import the `math` module, which provides functions for mathematical operations.
2. Take input for `A` and `B`.
3. Use the `math.gcd()` function to find the greatest common divisor (gcd) of `A` and `B`.
4. Calculate the least common multiple (lcm) by dividing the product of `A` and `B` by their gcd.
5. Print the lcm.<｜end▁of▁sentence｜>
