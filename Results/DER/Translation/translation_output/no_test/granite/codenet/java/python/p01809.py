System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import fractions

def gcd(a, b):
    while b!= 0:
        a, b = b, a % b
    return a

def main():
    p, q = map(int, input().split())
    g = gcd(p, q)
    p //= g
    q //= g
    ans = 1
    for i in range(2, int(q ** 0.5) + 1):
        if q % i == 0:
            ans *= i
            while q % i == 0:
                q //= i
    ans *= q
    print(ans)

if __name__ == '__main__':
    main()
```<|endoftext|>
