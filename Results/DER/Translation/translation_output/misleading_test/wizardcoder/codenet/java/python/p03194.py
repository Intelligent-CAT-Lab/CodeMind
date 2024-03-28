Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 24

Expected output:
33

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
    if p == 1:
        return 1
    for i in range(2, int(math.pow(p, 1/n))+1):
        if p % i == 0:
            return i
    return -1

n, p = map(int, input().split())
if n == 1:
    print(p)
else:
    res = find_power(n, p)
    if res == -1:
        print("No power found")
    else:
        print(res)
```

Explanation:

We first import the math module to use the pow() function. Then we define a function called find_power() which takes two arguments n and p. If p is equal to 1, we return 1 as it is the smallest power of 1. We then loop through all the numbers from 2 to the square root of p and check if p is divisible by any of them. If it is, we return that number as the power. If we have looped through all the numbers and not found a power, we return -1.

In the main function, we first take input from the user and store it in variables n and p. If n is equal to 1, we print p as it is the smallest power of 1. Otherwise, we call the find_power() function and store the result in a variable called res. If res is equal to -1, we print "No power found". Otherwise, we print res as the power.<|endoftext|>
