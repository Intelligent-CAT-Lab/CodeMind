<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
-47

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
[/INST]
```python
import math

def primeFactorize(n):
    res = []
    for a in range(2, int(math.sqrt(n))+1):
        if n % a == 0:
            ex = 0
            while n % a == 0:
                ex += 1
                n //= a
            res.append({a: ex})
    if n != 1:
        res.append({n: 1})
    return res

n = int(input())
ex = [0] * 1001
for i in range(2, n+1):
    pfs = primeFactorize(i)
    for pf in pfs:
        for k, v in pf.items():
            ex[k] += v

ans = 1
for i in range(2, n+1):
    ans *= (ex[i] + 1)
    ans %= 1000000007

print(ans)
```</s>
