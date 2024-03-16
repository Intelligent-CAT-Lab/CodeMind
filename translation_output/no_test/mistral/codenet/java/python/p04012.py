<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04012 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String w = sc.next();
		char[] c = w.toCharArray();
		char a = 'a';
		int acha = (int)a;
		a = 'z';
		int zcha = (int)a;
		int count = 0;
		for (int i = acha; i < zcha + 1; i++) {
			for (char x: c) {
				if (x == (char)i) {
					count++;
				}
			}
			if (count % 2 == 1) {
				System.out.println("No");
				return;
			}
			count = 0;
		}
		System.out.println("Yes");
	}
}
```
[/INST]
```python
import sys

w = input()
c = list(w)
a = ord('a')
acha = a
zcha = ord('z')
count = 0
for i in range(acha, zcha+1):
    for x in c:
        if x == chr(i):
            count += 1
    if count % 2 == 1:
        print("No")
        sys.exit()
    count = 0
print("Yes")
```</s>
