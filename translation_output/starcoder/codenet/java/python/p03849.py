<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
		if (memo!= null) return memo;
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

python code:<fim_suffix><fim_middle>
```python
MOD = 1000000007
mb = {}
def f(n):
	if n <= 2:
		return n
	if n in mb:
		return mb[n]
	res = f(n/2) + f((n-1)/2) + f((n+1)/2)
	res %= MOD
	mb[n] = res
	return res

n = int(raw_input())
print f(n+1)
```
<|endoftext|>
