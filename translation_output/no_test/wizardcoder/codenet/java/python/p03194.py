Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import math

def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(math.sqrt(n))+1):
        if n % i == 0:
            return False
    return True

def prime_factors(n):
    factors = []
    i = 2
    while i <= n:
        if n % i == 0 and is_prime(i):
            factors.append(i)
            n //= i
        else:
            i += 1
    return factors

n = int(input())
p = int(input())

if n == 1:
    print(p)
else:
    factors = prime_factors(p)
    for factor in factors:
        if math.pow(factor, n) == p:
            print(factor)
            break
    else:
        print(1)
```

Explanation:

- We first define a function `is_prime(n)` that checks if a number `n` is prime or not.
- We then define a function `prime_factors(n)` that returns a list of all prime factors of a number `n`.
- We read the input values `n` and `p` from the user.
- If `n` is equal to 1, we simply print `p` as the result.
- Otherwise, we find all prime factors of `p` using the `prime_factors(p)` function.
- We then loop through all the prime factors of `p` and check if `p` is divisible by `factor^n`. If it is, we print `factor` as the result and break out of the loop.
- If we have looped through all the prime factors of `p` and none of them satisfy the condition, we print 1 as the result.<|endoftext|>
