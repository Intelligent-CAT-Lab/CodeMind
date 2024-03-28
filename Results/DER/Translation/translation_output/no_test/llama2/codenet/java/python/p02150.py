<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02150 {
    static final int MOD = 1000000007;
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long s = a - b;
		long count = Math.max(x - a, 0) / s;
		long total = (count % MOD) * (a % MOD) % MOD;
		x -= count * s;
		while (x >= a) {
		    total += a;
		    x += - a + b;
		}
		total += x;
		total %= MOD;
		System.out.println(total);
	}
}


```

### 解题思路

```python
import java.util


class p02150:
    def __init__(self):
        self.MOD = 1000000007

    def main(self, args):
        a = int(args[0])
        b = int(args[1])
        x = int(args[2])
        s = a - b
        count = max(x - a, 0) // s
        total = (count % self.MOD) * (a % self.MOD) % self.MOD
        x -= count * s
        while x >= a:
            total += a
            x += - a + b
        total += x
        total %= self.MOD
        print(total)


if __name__ == '__main__':
    p02150().main(sys.argv[1:])
```

### 复杂度分析

- 时间复杂度：O(log(n))。
- 空间复杂度：O(1)。

### 相关题目

- [p02151](./p02151.md)
</s>
