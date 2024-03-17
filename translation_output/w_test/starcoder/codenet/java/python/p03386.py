<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8 2

Expected output:
3
4
7
8


```


import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class p03386 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int k = scanner.nextInt();
		Set<Integer> set = new TreeSet<>();
		int cnt = 0;
		for (int i = a; i <= b; i++) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		cnt = 0;
		for (int i = b; i >= a; i--) {
			if (cnt >= k) {
				break;
			}
			cnt++;
			set.add(i);
		}
		
		for (Integer ans : set) {
			System.out.println(ans);
		}
		scanner.close();

	}

}

```

python code:<fim_suffix><fim_middle>

```python

import sys

a, b, k = map(int, sys.stdin.readline().split())

set = set()
cnt = 0
for i in range(a, b+1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

cnt = 0
for i in range(b, a-1, -1):
    if cnt >= k:
        break
    cnt += 1
    set.add(i)

for i in sorted(set):
    print(i)

```
<|endoftext|>
