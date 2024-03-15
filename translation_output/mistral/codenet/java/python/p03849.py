<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.HashMap;
import java.util.Scanner;

public class p03849 {
	public static long MOD = 1000000007;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		System.out.println(f(n+1));
	}
	static HashMap<Long, Long> mb = new HashMap<>();
	public static long f(long n) {
		Long memo = mb.get(n);
		if (memo != null) return memo;
		if (n <= 2) {
			return n;
		}
		long res = f(n/2) + f((n-1)/2) + f((n+1)/2);
		res %= MOD;
		mb.put(n, res);
		return res;
	}
}


```
[/INST]
```python
import sys

MOD = 1000000007

def f(n):
    memo = {n: 0}
    if n <= 2:
        return n
    res = f(n//2) + f((n-1)//2) + f((n+1)//2)
    res %= MOD
    memo[n] = res
    return res

n = int(sys.stdin.readline())
print(f(n+1))
```</s>
