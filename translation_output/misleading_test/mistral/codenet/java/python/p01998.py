<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
7

```
import java.util.*;

public class p01998 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] && !arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}


```
[/INST]
```python
n = int(input())
arr = [False] * (n + 3)
arr[0] = arr[1] = True
count = 0
for i in range(2, len(arr)):
    if not arr[i]:
        for j in range(2, i):
            arr[i * j] = True
        if not arr[i] and not arr[i - 2]:
            count += 1
print(count * 2)
```</s>
