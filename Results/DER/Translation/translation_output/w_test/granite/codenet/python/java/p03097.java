System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 1 3

Expected output:
YES
1 0 2 3


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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] res = solve(n, a, b);
        if (res == null) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }
        }
    }

    public static int[] solve(int n, int a, int b) {
        int xor = a ^ b;
        int popCount = 0;
        for (int i = 0; i < 32; i++) {
            if ((xor & (1 << i))!= 0) {
                popCount++;
            }
        }
        if (popCount % 2 == 0) {
            return null;
        }
        int[] res = new int[n];
        int[] left = solve(n - 1, a, a ^ b);
        if (left == null) {
            return null;
        }
        for (int i = 0; i < n - 1; i++) {
            res[i] = left[i];
        }
        res[n - 1] = a ^ b;
        return res;
    }
}
```<|endoftext|>
