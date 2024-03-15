<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02137 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		System.out.println(p / 500 * 500);
	}
}


```
[/INST]
```python
import sys

p = int(input())
print(p // 500 * 500)
```</s>
