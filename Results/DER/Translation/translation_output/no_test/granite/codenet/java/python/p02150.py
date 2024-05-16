System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
MOD = 1000000007

def main():
    a, b, x = map(int, input().split())
    s = a - b
    count = (x - a) // s
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total += x
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```<|endoftext|>
