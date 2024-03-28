<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03194{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long p = sc.nextLong();
		if (n == 1) {
			System.out.println(p);
			return;
		}
		long res = 1;
		for (int i = 2; Math.pow(i, n) <= p; i++) {
			if (p % Math.pow(i, n) == 0) res = i;
		}
		System.out.println(res);
	}
}

```
[/INST]
```python
import math

n = int(input())
p = int(input())

if n == 1:
    print(p)
    return

res = 1
for i in range(2, int(math.pow(i, n))+1):
    if p % math.pow(i, n) == 0:
        res = i

print(res)
```</s>
