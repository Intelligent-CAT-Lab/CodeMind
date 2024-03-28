<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import math

def main():
    n, p = map(int, input().split())
    if n == 1:
        print(p)
        return
    res = 1
    for i in range(2, int(math.pow(p, 1/n)) + 1):
        if p % math.pow(i, n) == 0:
            res = i
    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, checks if the first one is 1, and if so, prints the second one. If not, it calculates the smallest integer `i` such that `i^n` is not greater than `p` and `p` is divisible by `i^n`. It then prints `i`.<｜end▁of▁sentence｜>
