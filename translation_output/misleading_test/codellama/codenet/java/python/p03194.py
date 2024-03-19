<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 24

Expected output:
33

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
[/INST]
```python
import math

def get_smallest_prime_factor(n, p):
    if n == 1:
        return p
    res = 1
    for i in range(2, int(math.pow(i, n))):
        if p % math.pow(i, n) == 0:
            res = i
    return res

n = int(input())
p = int(input())
print(get_smallest_prime_factor(n, p))
```
This code uses the same logic as the Java code, but it is written in Python. It uses the `math.pow()` function to calculate the power of a number, and it uses a for loop to iterate over the possible values of `i` until it finds the smallest prime factor of `p`. The `res` variable is used to store the smallest prime factor, and it is returned at the end of the function.

The input and output of the code are the same as the Java code, with the only difference being that the output is printed using the `print()` function in Python.</s>
