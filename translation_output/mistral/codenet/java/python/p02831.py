<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

A, B = map(int, sys.stdin.readline().split())
gcd = 0
for i in range(1, max(A, B)):
    if A % i == 0 and B % i == 0:
        gcd = i
lcm = A * B // gcd
print(lcm)
```</s>
