<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02712 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int list[] = new int[S + 1];
		long ans = 0;
		for (int i = 1; i < S + 1; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
			} else {
				ans = ans + i;
			}
		}
		System.out.println(ans);
	}
}

```
[/INST]
```python
import sys

S = int(input())
list = [0] * (S + 1)
ans = 0
for i in range(1, S + 1):
    if i % 3 == 0 or i % 5 == 0:
        pass
    else:
        ans += i
print(ans)
```</s>
