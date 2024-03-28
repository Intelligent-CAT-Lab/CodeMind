<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5 1 4

Expected output:
PNo

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
h, w, x, y = map(int, input().split())
if (h * w % 2 == 1 and (x + y) % 2 == 1):
    print("No")
else:
    print("Yes")
```</s>
