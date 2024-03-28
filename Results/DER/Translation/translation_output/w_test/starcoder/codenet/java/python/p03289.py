<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
AtCoder

Expected output:
AC


```
import java.util.Scanner;

public class p03289 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		if (c[0]!= 'A') {
			System.out.println("WA");
			return;
		}
		int count = 0;
		int index = 0;
		for (int i = 2; i < c.length - 1; i++) {
			if (c[i] == 'C') {
				count++;
				index = i;
			}
		}
		if (count!= 1) {
			System.out.println("WA");
			return;
		}

		for (int i = 0; i < c.length; i++) {
			if (i == 0 || i == index) {
				continue;
			}
			if (c[i] >= 'A' && c[i] <= 'Z') {
				System.out.println("WA");
				return;
			}
		}
		System.out.println("AC");
		sc.close();
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

S = sys.stdin.readline().strip()

if S[0]!= 'A':
    print('WA')
    exit()

count = 0
index = 0
for i in range(2, len(S) - 1):
    if S[i] == 'C':
        count += 1
        index = i

if count!= 1:
    print('WA')
    exit()

for i in range(len(S)):
    if i == 0 or i == index:
        continue
    if S[i] >= 'A' and S[i] <= 'Z':
        print('WA')
        exit()

print('AC')
```
<|endoftext|>
