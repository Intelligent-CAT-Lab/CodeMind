<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int popCount = popCount(a ^ b);
        if (popCount % 2 == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            List<Integer> left = f(n, a, b);
            for (int i : left) {
                System.out.print(i + " ");
            }
        }
    }

    public static int popCount(int x) {
        int res = 0;
        for (int i = 1; i <= 17; i++) {
            res += ((x >> i) & 1 == 1);
        }
        return res;
    }

    public static List<Integer> f(int m, int x, int y) {
        if (m == 1) {
            if (x == 0) {
                return new ArrayList<>(Arrays.asList(0, 1));
            } else {
                return new ArrayList<>(Arrays.asList(1, 0));
            }
        }
        List<Integer> res = new ArrayList<>(Arrays.asList(x));
        for (int i = 0; i < m - 1; i++) {
            if ((x >> i) != (y >> i)) {
                int diff = i;
                break;
            }
        }
        int s = (x & ((1 << diff) - 1)) + (((x >> (diff + 1)) << 1) << (diff + 1));
        int t = (y & ((1 << diff) - 1)) + (((y >> (diff + 1)) << 1) << (diff + 1));
        //return s, t;
        int u = s ^ 1;
        List<Integer> left = f(m - 1, s, u);
        List<Integer> right = f(m - 1, u, t);
        //System.out.println(left, right);
        int xBit = (x >> diff) & 1;
        int yBit = (y >> diff) & 1;
        List<Integer> left2 = new ArrayList<>(Arrays.asList());
        for (int l : left) {
            int newL = (l >> diff) | (2 << diff * xBit);
            int newR = (l << 1) | (2 << diff * yBit);
            newL = newL & ((1 << (diff + 1)) - 1);
            newR = newR & ((1 << (diff + 1)) - 1);
            left2.add(newL + newR);
        }
        List<Integer> right2 = new ArrayList<>(Arrays.asList());
        for (int r : right) {
            int newL = (r >> diff) | (2 << diff * xBit);
            int newR = (r << 1) | (2 << diff * yBit);
            newL = newL & ((1 << (diff + 1)) - 1);
            newR = newR & ((1 << (diff + 1)) - 1);
            right2.add(newL + newR);
        }
        return left2.addAll(right2);
    }
}
```</s>
