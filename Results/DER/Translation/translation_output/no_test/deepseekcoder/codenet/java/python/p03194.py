<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import math

def p03194():
    n = int(input())
    p = int(input())
    if n == 1:
        print(p)
        return
    res = 1
    i = 2
    while math.pow(i, n) <= p:
        if p % math.pow(i, n) == 0:
            res = i
        i += 1
    print(res)

p03194()
```
<|EOT|>
