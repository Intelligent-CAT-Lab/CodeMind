<s> Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03828 {

    private static final long MOD = 1000000007;

    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        final int n = sc.nextInt();

        final int[] ex = new int[1001];
        for (int i = 2; i <= n; i++) {
            final List<Map<Integer, Integer>> pfs = primeFactorize(i);
            for (Map<Integer, Integer> pf : pfs) {
                for (Map.Entry<Integer, Integer> e : pf.entrySet()) {
                    ex[e.getKey()] += e.getValue();
                }
            }
        }

        long ans = 1;
        for (int i = 2; i <= n; i++) {
            ans *= ex[i] + 1;
            ans %= MOD;
        }

        System.out.println(ans);
    }

    private static List<Map<Integer, Integer>> primeFactorize(int n) {
        final List<Map<Integer, Integer>> res = new ArrayList<>();
        for (int a = 2; a*a <= n; a++) {
            if (n % a != 0) {
                continue;
            }
            int ex = 0;
            while (n % a == 0) {
                ex++;
                n /= a;
            }
            res.add(Collections.singletonMap(a, ex));
        }
        if (n != 1) {
            res.add(Collections.singletonMap(n, 1));
        }
        return res;
    }
}

```

### 解题思路

```python
import java.util

class p03828:

    def __init__(self):
        self.MOD = 1000000007

    def main(self, args):
        sc = java.util.Scanner(System.in)
        n = sc.nextInt()
        ex = [0] * 1001
        for i in range(2, n+1):
            pfs = self.primeFactorize(i)
            for pf in pfs:
                for e in pf.entrySet():
                    ex[e.getKey()] += e.getValue()
        ans = 1
        for i in range(2, n+1):
            ans *= ex[i] + 1
            ans %= self.MOD
        print(ans)

    def primeFactorize(self, n):
        res = []
        for a in range(2, n+1):
            if n % a != 0:
                continue
            ex = 0
            while n % a == 0:
                ex += 1
                n /= a
            res.append(dict(a=a, ex=ex))
        if n != 1:
            res.append(dict(n=n, ex=1))
        return res

if __name__ == '__main__':
    p03828().main(sys.argv[1:])
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(n)。

### 相关题目

- [p03827](./p03827.md)
</s>
