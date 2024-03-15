<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解题思路

```python
import java.util.Scanner;

class p00494:

    def __init__(self):
        self.sc = Scanner(System.in)

    def main(self):
        str = ("$" + self.sc.next() + "$").toCharArray()
        ans = 0
        s = 0
        for i in range(1, len(str)):
            if str[i] == 'O' and str[i - 1] != 'O':
                s = i
            if str[i] == 'O' and str[i + 1] != 'O':
                l = i - s + 1
                if s >= l and len(str) - i - 1 >= l:
                    ok = True
                    for j in range(0, l):
                        if str[s - 1 - j] != 'J' or str[i + 1 + j] != 'I':
                            ok = False
                            break
                    if ok:
                        ans = max(ans, l)
        print(ans)
```

### 复杂度分析

- 时间复杂度：O(n)。
- 空间复杂度：O(1)。

### 相关题目

- [p00493](./p00493.md)
</s>
