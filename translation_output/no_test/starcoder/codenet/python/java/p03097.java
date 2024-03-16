<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
sys.setrecursionlimit(10**6)

n, a, b = map(int, input().split())
def pop_count(x):
	res = 0
	for i in range(17):
		res += ((x>>i)%2 == 1)
	return res
if (pop_count(a^b)) % 2 == 0:
	print("NO")
else:
	print("YES")
	def f(m, x, y):
		if m == 1:
			if x == 0:
				return [0, 1]
			else:
				return [1, 0]

		res = [x]
		for i in range(m):
			if (x>>i) % 2 != (y>>i) % 2:
				diff = i
				break
		s = (x % (2**diff)) + (((x // (2**(diff+1))) * 2**(diff+1)) >> 1)
		t = (y % (2**diff)) + (((y // (2**(diff+1))) * 2**(diff+1)) >> 1)
		#return s, t
		u = s^1
		left = f(m-1, s, u)
		right = f(m-1, u, t)
		#print(left, right)
		x_bit, y_bit = (x>>diff) % 2, (y>>diff) % 2
		left = [l % (2**diff) + (2**diff * x_bit) + (((l // (2**diff)) * 2**diff) << 1) for l in left]
		right = [r % (2**diff) + (2**diff * y_bit) + (((r // (2**diff)) * 2**diff) << 1) for r in right]
		return left + right
	print(*f(n, a, b))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[] res = new int[n];
		int[] a_bits = new int[17];
		int[] b_bits = new int[17];
		for (int i = 0; i < 17; i++) {
			a_bits[i] = (a >> i) & 1;
			b_bits[i] = (b >> i) & 1;
		}
		int diff = 0;
		for (int i = 0; i < 17; i++) {
			if (a_bits[i]!= b_bits[i]) {
				diff = i;
				break;
			}
		}
		int s = (a % (1 << diff)) + (((a >> (diff + 1)) * (1 << (diff + 1))) >> 1);
		int t = (b % (1 << diff)) + (((b >> (diff + 1)) * (1 << (diff + 1))) >> 1);
		int u = s ^ 1;
		int[] left = f(n - 1, s, u);
		int[] right = f(n - 1, u, t);
		int x_bit = (a >> diff) & 1;
		int y_bit = (b >> diff) & 1;
		for (int i = 0; i < n; i++) {
			res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] >> diff) * (1 << diff)) << 1);
			res[i] = (res[i] % (1 << diff)) + (1 << diff) * y_bit + (((res[i] >> diff) * (1 << diff)) << 1);
		}
		System.out.println("YES");
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public static int[] f(int n, int s, int t) {
		if (n == 1) {
			if (s == 0) {
				return new int[] { 0, 1 };
			} else {
				return new int[] { 1, 0 };
			}
		}
		int[] res = new int[n];
		int diff = 0;
		for (int i = 0; i < 17; i++) {
			if ((s >> i) & 1!= (t >> i) & 1) {
				diff = i;
				break;
			}
		}
		int u = s ^ 1;
		int[] left = f(n - 1, s, u);
		int[] right = f(n - 1, u, t);
		int x_bit = (s >> diff) & 1;
		int y_bit = (t >> diff) & 1;
		for (int i = 0; i < n; i++) {
			res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] >> diff) * (1 << diff)) << 1);
			res[i] = (res[i] % (1 << diff)) + (1 << diff) * y_bit + (((res[i] >> diff) * (1 << diff)) << 1);
		}
		return res;
	}
}
```
'''
<|endoftext|>
