<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

		while(bq % bp!= 0) {
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

python code:<fim_suffix><fim_middle>

```python
import math

def gcd(a,b):
	if b == 0:
		return a
	else:
		return gcd(b,a%b)

def main():
	p,q = map(int,raw_input().split())
	while q % p!= 0:
		p,q = q,p%q
	print q/p

if __name__ == '__main__':
	main()

```
<|endoftext|>
