<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the equivalent Python code:

```python
import math

def main():
    n = int(input())
    p = int(input())
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

This Python code does the same thing as the Java code. It reads two integers from the standard input, checks if the first one is 1, and if so, prints the second one. Otherwise, it calculates the largest integer `i` such that `i^n` is less than or equal to `p` and `p` is divisible by `i^n`. The result is then printed.<｜end▁of▁sentence｜>
