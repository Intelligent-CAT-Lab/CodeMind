Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
-60

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

### Response:
```python
import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    p, q = map(int, input().split())
    bp, bq = p, q
    buf = p
    while bq % bp!= 0:
        buf = bq % bp
        bq = bp
        bp = buf
    qs = q // buf
    ans = 1
    for i in range(2, int(math.sqrt(qs))+1):
        if qs % i == 0:
            while qs % i == 0:
                qs //= i
            ans *= i
    ans *= qs
    print(ans)

if __name__ == '__main__':
    main()
```

Explanation:

- We first import the `math` module to use the `sqrt()` function.
- We define a function `gcd()` to find the greatest common divisor of two numbers.
- We define the `main()` function which reads the input from the user, finds the greatest common divisor of `p` and `q`, and then calculates the value of `ans`.
- We initialize `bp`, `bq`, and `buf` to `p`, `q`, and `p` respectively.
- We use a while loop to find the value of `buf` such that `bq` is divisible by `bp`.
- We then calculate the value of `qs` as `q/buf`.
- We use a for loop to find all the factors of `qs` and multiply them to `ans`.
- Finally, we print the value of `ans`.<|endoftext|>
