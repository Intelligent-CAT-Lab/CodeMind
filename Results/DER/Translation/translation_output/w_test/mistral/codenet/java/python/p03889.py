<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
Yes


```
import java.util.*;

public class p03889 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'b') {
				arr[i] = 'd';
			} else if (arr[i] == 'd') {
				arr[i] = 'b';
			} else if (arr[i] == 'p') {
				arr[i] = 'q';
			} else if (arr[i] == 'q') {
				arr[i] = 'p';
			}
		}
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
		if (s.equals(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

```
[/INST]
```python
s = input()
arr = list(s)
for i in range(len(arr)):
    if arr[i] == 'b':
        arr[i] = 'd'
    elif arr[i] == 'd':
        arr[i] = 'b'
    elif arr[i] == 'p':
        arr[i] = 'q'
    elif arr[i] == 'q':
        arr[i] = 'p'
arr = ''.join(arr)
if s == arr[::-1]:
    print("Yes")
else:
    print("No")
```</s>
