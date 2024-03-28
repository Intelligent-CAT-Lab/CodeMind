<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

MOD = 1000000007

def main():
    a = int(input())
    b = int(input())
    x = int(input())
    s = a - b
    count = max(x - a, 0) // integer division
    total = (count % MOD) * (a % MOD) % MOD
    x -= count * s
    while x >= a:
        total += a
        x += - a + b
    total %= MOD
    print(total)

if __name__ == "__main__":
    main()
```</s>
