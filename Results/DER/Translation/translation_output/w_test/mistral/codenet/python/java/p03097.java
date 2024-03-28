<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
			if (x>>i) % 2  != (y>>i) % 2:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int popCount = popCount(a ^ b);
        if (popCount % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> left = f(n, a, b);
            List<Integer> right = f(n, b, a);
            for (int i = 0; i < left.size(); i++) {
                left.set(i, left.get(i) ^ 1);
            }
            for (int i = 0; i < right.size(); i++) {
                right.set(i, right.get(i) ^ 1);
            }
            System.out.println(Arrays.toString(left));
            System.out.println(Arrays.toString(right));
        }
    }

    public static int popCount(int x) {
        int res = 0;
        for (int i = 1; i < 17; i++) {
            res += ((x >> i) & 1 == 1);
        }
        return res;
    }

    public static List<Integer> f(int m, int x, int y) {
        List<Integer> res = new ArrayList<>();
        if (m == 1) {
            if (x == 0) {
                res.add(0);
                res.add(1);
            } else {
                res.add(1);
                res.add(0);
            }
        } else {
            res.add(x);
            for (int i = 1; i < m; i++) {
                if ((x >> i) != (y >> i)) {
                    int diff = i;
                    break;
                }
            }
            int s = (x & ((1 << diff) - 1)) + (((x >> (diff + 1)) << 1) | (((x >> (diff + 1)) >> 1) & 1));
            int t = (y & ((1 << diff) - 1)) + (((y >> (diff + 1)) << 1) | (((y >> (diff + 1)) >> 1) & 1));
            List<Integer> left = f(m - 1, s, (s ^ 1));
            List<Integer> right = f(m - 1, (s ^ 1), t);
            for (int i = 0; i < left.size(); i++) {
                left.set(i, left.get(i) ^ (1 << diff) | (2 << diff * (i % 2)));
            }
            for (int i = 0; i < right.size(); i++) {
                right.set(i, right.get(i) ^ (1 << diff) | (2 << diff * (i % 2)));
            }
            res.addAll(left);
            res.addAll(right);
        }
        return res;
    }
}
```</s>
