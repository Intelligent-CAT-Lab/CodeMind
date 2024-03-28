<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import math

def main():
    p, q = map(int, input().split())
    qs = q // math.gcd(p, q)
    ans = 1
    for i in range(2, int(math.sqrt(qs)) + 1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

if __name__ == "__main__":
    main()
```
Note that the `math.gcd` function is used to compute the greatest common divisor of `p` and `q`, which is used to compute `qs`. The rest of the code is similar to the Java code, with some minor changes to account for the differences in syntax between Python and Java.</s>
