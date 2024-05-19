System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 4 0 0 3 3

Expected output:
2


```
from math import factorial
def comb (x,y):
	return factorial(x)//factorial(x-y)//factorial(y)

w,h,ax,ay,bx,by=map(int,input().split())
dx=min(w-abs(ax-bx),abs(ax-bx))
dy=min(h-abs(ay-by),abs(ay-by))
ans=1
if dx*2==w:ans*=2
if dy*2==h:ans*=2
ans*=comb(dx+dy,dx)
print(ans%100000007)
```


Answer:
```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	// Returns value of Binomial Coefficient C(n, k)
	static long nCr(long n, long k)
	{
		long res = 1;
		
		// Since C(n, k) = C(n, n-k)
		if (k > n - k)
			k = n - k;
		
		// Calculate value of
		// [n * (n-1) *---* (n-k+1)] / [k * (k-1) *----* 1]
		for (int i = 0; i < k; ++i)
		{
			res *= (n - i);
			res /= (i + 1);
		}
		
		return res;
	}
	
	// Returns modulo inverse of a
	// with respect to m using extended
	// Euclid Algorithm. Refer below post for details:
	// https://www.geeksforgeeks.org/multiplicative-inverse-under-modulo-m/
	static long modInverse(long a, long m)
	{
		long m0 = m;
		long y = 0, x = 1;
		
		if (m == 1)
			return 0;
		
		// Apply extended Euclid Algorithm
		while (a > 1)
		{
			// q is quotient
			long q = a / m;
			
			long t = m;
			
			// m is remainder now, process
			// same as Euclid's algorithm
			m = a % m;
			a = t;
			
			t = y;
			
			// Update x and y
			y = x - q * y;
			x = t;
		}
		
		// Make x positive
		if (x < 0)
			x += m0;
		
		return x;
	}
	
	// Returns modulo inverse of a
	// with respect to m usingfermat's
	// little theorem.
	static long modInverseFermat(long a, long m)
	{
		return pow(a, m - 2, m);
	}
	
	// Returns nCr % p using Fermat's
	// little theorem.
	static long nCrModPFermat(long n, long r,
								long p)
	{
		
		// Base case
		if (r == 0)
			return 1;
		
		// Fill factorial array so that we
		// can find all factorial of r, n
		// and n-r
		long[] fac = new long[(int)n + 1];
		fac[0] = 1;
		
		for (int i = 1; i <= n; i++)
			fac[i] = fac[i - 1] * i % p;
		
		return (fac[(int)n] * modInverseFermat(fac[(int)r], p) % p * modInverseFermat(fac[(int)(n - r)], p) % p) % p;
	}
	
	static long pow(long x, long y, long p)
	{
		// Initialize result
		long res = 1;
		
		// Update x if it is more than or
		// equal to p
		x = x % p;
		
		while (y > 0)
		{
			// If y is odd, multiply x with result
			if (y % 2 == 1)
				res = (res * x) % p;
			
			// y must be even now
			y = y >> 1; // y = y/2
			x = (x * x) % p;
		}
		
		return res;
	}
	
	// Driver code
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		long w=sc.nextLong();
		long h=sc.nextLong();
		long ax=sc.nextLong();
		long ay=sc.nextLong();
		long bx=sc.nextLong();
		long by=sc.nextLong();
		long dx=Math.min(w-Math.abs(ax-bx),Math.abs(ax-bx));
		long dy=Math.min(h-Math.abs(ay-by),Math.abs(ay-by));
		long ans=1;
		if(dx*2==w)ans*=2;
		if(dy*2==h)ans*=2;
		ans*=(nCrModPFermat(dx+dy,dx,1000000007));
		System.out.println(ans%1000000007);
	}
}
```<|endoftext|>
