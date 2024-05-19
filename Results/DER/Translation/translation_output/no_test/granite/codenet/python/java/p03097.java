System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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
        int[] ans = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (((a >> i) & 1)!= ((b >> i) & 1)) {
                count++;
            }
        }
        if (count % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            int m = n;
            int x = a;
            int y = b;
            for (int i = 0; i < m; i++) {
                if (((x >> i) & 1)!= ((y >> i) & 1)) {
                    int diff = i;
                    break;
                }
            }
            int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
            int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
            int u = s ^ 1;
            int[] left = f(m - 1, s, u);
            int[] right = f(m - 1, u, t);
            int x_bit = (x >> diff) & 1;
            int y_bit = (y >> diff) & 1;
            for (int i = 0; i < left.length; i++) {
                ans[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] / (1 << diff)) * (1 << diff)) << 1);
            }
            for (int i = 0; i < right.length; i++) {
                ans[i + left.length] = (right[i] % (1 << diff)) + (1 << diff) * y_bit + (((right[i] / (1 << diff)) * (1 << diff)) << 1);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
        }
    }

    public static int[] f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new int[]{0, 1};
            } else {
                return new int[]{1, 0};
            }
        }
        int[] res = new int[1 << m];
        int diff = 0;
        for (int i = 0; i < m; i++) {
            if (((x >> i) & 1)!= ((y >> i) & 1)) {
                diff = i;
                break;
            }
        }
        int s = (x % (1 << diff)) + (((x / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int t = (y % (1 << diff)) + (((y / (1 << (diff + 1))) * (1 << (diff + 1))) >> 1);
        int u = s ^ 1;
        int[] left = f(m - 1, s, u);
        int[] right = f(m - 1, u, t);
        int x_bit = (x >> diff) & 1;
        int y_bit = (y >> diff) & 1;
        for (int i = 0; i < left.length; i++) {
            res[i] = (left[i] % (1 << diff)) + (1 << diff) * x_bit + (((left[i] / (1 << diff)) * (1 << diff)) << 1);
        }
        for (int i = 0; i < right.length; i++) {
            res[i + left.length] = (right[i] % (1 << diff)) + (1 << diff) * y_bit + (((right[i] / (1 << diff)) * (1 << diff)) << 1);
        }
        return res;
    }
}
```<|endoftext|>
