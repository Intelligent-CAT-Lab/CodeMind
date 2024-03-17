Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


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

def find_power(n, p):
    if n == 1:
        return p
    res = 1
    for i in range(2, int(math.pow(p, 1/n))+1):
        if p % math.pow(i, n) == 0:
            res = i
    return res

n, p = map(int, input().split())
print(find_power(n, p))
```

Explanation:

We first import the math module to use the pow() function. Then we define a function called find_power() which takes two arguments n and p. If n is equal to 1, we simply return p. Otherwise, we initialize a variable called res to 1 and loop through all integers i from 2 to the integer part of p raised to the power of 1/n. If p is divisible by i raised to the power of n, we update res to i. Finally, we return res.

In the main function, we first read the input values of n and p using the map() function. We then call the find_power() function with these values and print the result.<|endoftext|>
