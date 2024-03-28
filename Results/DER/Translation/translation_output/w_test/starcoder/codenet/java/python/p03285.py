<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11

Expected output:
Yes


```
import java.util.*;
public class p03285 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int limit7 = N / 7;
		boolean check = false;
		for (int i = 0; i <= limit7; i++) {
			int left = N-(i*7);
			if (left % 4 == 0) {
				check = true;
			}
		}
		if (check) {
		System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

N = int(sys.stdin.readline())

limit7 = N // 7
check = False

for i in range(limit7 + 1):
    left = N - (i * 7)
    if left % 4 == 0:
        check = True

if check:
    print("Yes")
else:
    print("No")
```
<|endoftext|>
