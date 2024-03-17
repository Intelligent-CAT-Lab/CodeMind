<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


```
import java.util.Scanner;

public class p02831 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long A, B;
		A = sc.nextLong();
		B = sc.nextLong();
		sc.close();

		long gcd = 0;
		for (int i = 1; i < Math.max(A, B); i++) {
			if (A % i == 0 && B % i == 0) {
				gcd = i;
			}
		}
		long lcm = A * B / gcd;
		System.out.println(lcm);
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

A, B = map(int, sys.stdin.readline().split())

def gcd(a, b):
    if b == 0:
        return a
    return gcd(b, a % b)

print(A * B // gcd(A, B))
```
<|endoftext|>
