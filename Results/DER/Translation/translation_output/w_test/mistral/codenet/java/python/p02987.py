<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes


```
import java.util.Arrays;
import java.util.Scanner;

public class p02987 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s= sc.next().toCharArray();
		Arrays.sort(s);
		if (s[0]==s[1]&&s[2]==s[3]&&s[1]!=s[2]) {
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
s = sorted(s)
if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
    print("Yes")
else:
    print("No")
```</s>
