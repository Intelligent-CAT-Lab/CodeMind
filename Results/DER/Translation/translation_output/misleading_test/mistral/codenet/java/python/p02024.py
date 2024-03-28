<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 5 2 3

Expected output:
Ys

```
import java.util.*;

public class p02024 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long h = sc.nextInt();
		long w = sc.nextInt();
		long s = sc.nextInt();
		long t = sc.nextInt();
		if (h * w % 2 == 1 && (s * w + t) % 2 == 1) {
		    System.out.println("No");
		} else {
		    System.out.println("Yes");
		}
	}
}


```
[/INST]
```python
h, w, s, t = map(int, input().split())
if (h * w % 2 == 1 and (s * w + t) % 2 == 1):
    print("No")
else:
    print("Yes")
```</s>
