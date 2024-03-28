<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
OJJOOIIOJOI

Expected output:
2


```
import java.util.Scanner;

public class p00494 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] str = ("$" + sc.next() + "$").toCharArray();
		int ans = 0;
		int s = 0;
		for (int i = 1; i < str.length; ++i) {
			if (str[i] == 'O' && str[i - 1] != 'O') s = i;
			if (str[i] == 'O' && str[i + 1] != 'O') {
				int l = i - s + 1;
				if (s >= l && str.length - i - 1 >= l) {
					boolean ok = true;
					for (int j = 0; j < l; ++j) {
						if (str[s - 1 - j] != 'J' || str[i + 1 + j] != 'I') {
							ok = false;
							break;
						}
					}
					if (ok) ans = Math.max(ans, l);
				}
			}
		}
		System.out.println(ans);
	}
}
```
[/INST]
```python
def p00494():
    str = input("$" + input() + "$")
    ans = 0
    s = 0
    for i in range(1, len(str)):
        if str[i] == 'O' and str[i - 1] != 'O':
            s = i
        if str[i] == 'O' and str[i + 1] != 'O':
            l = i - s + 1
            if s >= l and len(str) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if str[s - 1 - j] != 'J' or str[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

p00494()
```</s>
