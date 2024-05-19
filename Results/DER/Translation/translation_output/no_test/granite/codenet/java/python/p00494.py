System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00494 {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		char[] str = ("$" + sc.next() + "$").toCharArray();
		int ans = 0;
		int s = 0;
		for (int i = 1; i < str.length; ++i) {
			if (str[i] == 'O' && str[i - 1]!= 'O') s = i;
			if (str[i] == 'O' && str[i + 1]!= 'O') {
				int l = i - s + 1;
				if (s >= l && str.length - i - 1 >= l) {
					boolean ok = true;
					for (int j = 0; j < l; ++j) {
						if (str[s - 1 - j]!= 'J' || str[i + 1 + j]!= 'I') {
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


Answer:
```python
import sys

def main():
    s = "$" + input() + "$"
    ans = 0
    for i in range(1, len(s) - 1):
        if s[i] == "O" and s[i - 1]!= "O":
            start = i
        if s[i] == "O" and s[i + 1]!= "O":
            length = i - start + 1
            if start >= length and len(s) - i - 1 >= length:
                ok = True
                for j in range(length):
                    if s[start - 1 - j]!= "J" or s[i + 1 + j]!= "I":
                        ok = False
                        break
                if ok:
                    ans = max(ans, length)
    print(ans)

if __name__ == "__main__":
    sys.exit(main())
```<|endoftext|>
