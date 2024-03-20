Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
import math

A, B = map(int, input().split())

gcd = 0
for i in range(1, max(A, B)):
    if A % i == 0 and B % i == 0:
        gcd = i

lcm = A * B // gcd
print(lcm)
```

Explanation:

- We first import the `math` module to use the `gcd()` function.
- We read the input values of `A` and `B` using the `input()` function and convert them to integers using the `map()` function.
- We initialize the `gcd` variable to 0.
- We loop through all the numbers from 1 to the maximum of `A` and `B` using the `range()` function.
- For each number, we check if it is a factor of both `A` and `B` using the modulo operator `%`.
- If it is, we update the `gcd` variable to that number.
- After the loop, we calculate the `lcm` by multiplying `A` and `B` and dividing by the `gcd` using the floor division operator `//`.
- Finally, we print the `lcm` using the `print()` function.<|endoftext|>
