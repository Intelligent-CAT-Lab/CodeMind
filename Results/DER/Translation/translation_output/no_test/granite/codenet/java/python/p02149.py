System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02149 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
		    int x = sc.nextInt();
		    if (max < x) {
		        max = x;
		        idx = i;
		    }
		}
		System.out.println((char)('A' + idx));
	}
}


```


Answer:
```python
import sys

max_val = 0
max_idx = 0
for i, x in enumerate(map(int, sys.stdin.read().split())):
    if x > max_val:
        max_val = x
        max_idx = i
print(chr(ord('A') + max_idx))
```<|endoftext|>
