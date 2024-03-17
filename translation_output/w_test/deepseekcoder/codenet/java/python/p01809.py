<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
2


```
import java.util.ArrayList;
import java.util.Scanner;

public class p01809{
	public static void main(String args[]) {
		ArrayList<Long> yaku = new ArrayList<Long>();

		Scanner scn = new Scanner(System.in);
		long p = scn.nextLong(), q = scn.nextLong();
		scn.close();
		long qs;
		long ans = 1;
		long bp = p,bq = q,buf = p;

		while(bq % bp != 0) {
			buf = bq % bp;
			bq = bp;
			bp = buf;
		}
		qs = q/buf;
		for(long i = 2;i <= Math.sqrt(qs);i++) {
			if(qs % i ==0) {
				while(qs % i == 0) {
					qs /=i;
				}
				ans *= i;
			}
		}
		ans*= qs;
		System.out.println(ans);
	}
}

```

### Response:
```python
import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def smallest_prime_factor(n):
    if n % 2 == 0:
        return 2
    sqrt_n = math.isqrt(n)
    for i in range(3, sqrt_n + 1, 2):
        if n % i == 0:
            return i
    return n

def smallest_prime_factors(n):
    factors = []
    while n % 2 == 0:
        factors.append(2)
        n //= 2
    for i in range(3, int(math.sqrt(n)) + 1, 2):
        while n % i == 0:
            factors.append(i)
            n //= i
    if n > 2:
        factors.append(n)
    return factors

def solve(p, q):
    g = gcd(p, q)
    p //= g
    q //= g
    factors = smallest_prime_factors(q)
    factors.sort()
    factors.append(q)
    return factors[-2]

p, q = map(int, input().split())
print(solve(p, q))
```

This Python code does the same thing as the Java code. It first calculates the greatest common divisor (gcd) of p and q, then divides both p and q by this gcd. It then finds the smallest prime factor of q, and if this factor is not p, it returns this factor. If p is the smallest prime factor of q, it finds the second smallest prime factor of q and returns this.
<|EOT|>
