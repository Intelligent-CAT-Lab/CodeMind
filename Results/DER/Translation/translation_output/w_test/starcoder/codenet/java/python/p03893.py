<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
14


```
import java.util.*;

public class p03893 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long next = 2;
		for (int i = 0; i < x; i++) {
			next = (next + 1) * 2;
		}
		System.out.println(next);
	}
}

```

python code:<fim_suffix><fim_middle>

```python
import sys

x = int(sys.stdin.readline())
next = 2
for i in range(x):
    next = (next + 1) * 2
print(next)
```
<|endoftext|>
