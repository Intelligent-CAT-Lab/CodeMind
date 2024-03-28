<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import math

def main():
    n, p = map(int, input().split())
    if n == 1:
        print(p)
        return
    res = 1
    for i in range(2, int(math.pow(i, n))):
        if p % math.pow(i, n) == 0:
            res = i
    print(res)

if __name__ == "__main__":
    main()
```
This is the Python code for the given Java code. The `math` module is used to calculate the power of a number. The `map` function is used to convert the input string to a list of integers. The `range` function is used to iterate from 2 to the power of `n`. The `if` statement checks if the power of `i` is less than or equal to `p`, and if it is, it checks if `p` is divisible by the power of `i`. If it is, it sets `res` to `i`. Finally, it prints `res`.</s>
