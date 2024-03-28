<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import math

def gcd(p, q):
    while q != 0:
        p, q = q, p % q
    return p

def main():
    p, q = map(int, input().split())
    g = gcd(p, q)
    q //= g
    ans = 1
    for i in range(2, int(math.sqrt(q)) + 1):
        if q % i == 0:
            while q % i == 0:
                q //= i
            ans *= i
    ans *= q
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It calculates the greatest common divisor (gcd) of two numbers and then finds the smallest prime factor of the quotient of the two numbers. The smallest prime factor is then printed out.<｜end▁of▁sentence｜>
