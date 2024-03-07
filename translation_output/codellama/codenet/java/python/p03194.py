<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```
import math

n = int(input())
p = int(input())

if n == 1:
    print(p)
    return

res = 1
for i in range(2, int(math.pow(n, n))):
    if p % math.pow(i, n) == 0:
        res = i

print(res)
```
Note: The `math.pow()` function is used to calculate the power of a number, and the `range()` function is used to generate a sequence of numbers from 2 to the power of `n`. The `if` statement checks if the current number `i` is a factor of `p`, and if it is, it updates the result `res` with the current number. Finally, the result `res` is printed.</s>
