<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02017 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		if (h * w % 2 == 1 && (x + y) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```
[/INST]
```python
import sys

h, w, x, y = map(int, sys.stdin.readline().split())
if (h * w % 2 == 1 and (x + y) % 2 == 1):
    print("No")
else:
    print("Yes")
```</s>
