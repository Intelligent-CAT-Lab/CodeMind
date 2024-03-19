<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
92

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

def lcm(A, B):
    return (A*B) // math.gcd(A, B)

A, B = map(int, input().split())
print(lcm(A, B))
```

In this Python code, we use the built-in `math.gcd()` function to calculate the greatest common divisor (gcd) of `A` and `B`. The least common multiple (lcm) is then calculated by dividing the product of `A` and `B` by their gcd. The `map(int, input().split())` line reads two space-separated integers from the user input.<｜end▁of▁sentence｜>
