<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import math

def gcd(p, q):
    while q % p != 0:
        buf = q % p
        q = p
        p = buf
    return q

def prime_factors(n):
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
    qs = q // g
    factors = prime_factors(qs)
    ans = 1
    for f in factors:
        ans *= f
    return ans

p = int(input("Enter p: "))
q = int(input("Enter q: "))
print(solve(p, q))
```
This code first finds the greatest common divisor (gcd) of p and q using the Euclidean algorithm. It then divides q by the gcd to get qs, which is the reduced form of q.

Next, it finds the prime factors of qs using the Sieve of Eratosthenes. It then multiplies all the prime factors together to get the final answer.

Note that the code uses the `math.sqrt()` function to find the square root of a number, which is more efficient than using a loop to iterate over all numbers up to the square root.</s>
