Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
    ans = 1
    while q % p!= 0:
        r = q % p
        q = p
        p = r
    qs = q // p
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

- We first define a function `gcd` to find the greatest common divisor of two numbers.
- We then define the `main` function which reads the input from the user and initializes the answer to 1.
- We use a while loop to find the value of `p` such that `q` is divisible by `p`. We keep updating `q` and `p` until `q` is divisible by `p`.
- We then calculate the value of `qs` as `q` divided by `p`.
- We use a for loop to iterate over all the numbers from 2 to the square root of `qs`. If `qs` is divisible by any of these numbers, we keep dividing `qs` by that number until it is no longer divisible. We then multiply the answer by that number.
- Finally, we multiply the answer by `qs` and print the result.<|endoftext|>
