<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p03779{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int ans = 0;

		for (int i = 0; i < 100000; i++) {
			if (x <= i * (i + 1) / 2) {
				ans = i;
				break;
			}
		}
		System.out.println(ans);
	}

}

```
[/INST]
```python
import sys

x = int(input())
ans = 0

for i in range(100000):
    if x <= i * (i + 1) // 2:
        ans = i
        break

print(ans)
```</s>
