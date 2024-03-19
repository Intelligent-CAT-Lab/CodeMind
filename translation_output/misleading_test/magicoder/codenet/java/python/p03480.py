<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
010

Expected output:
24

```
import java.util.Scanner;

public class p03480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();
		s += '2';
		int n = s.length(), ans = n - 1;
		for(int i = 0; i < n - 1; ++i) {
			if(s.charAt(i) != s.charAt(i + 1)) {
				int tmp = Math.max(i + 1,  n - i - 2);
				ans = Math.min(ans,  tmp);
			}
		}
		System.out.println(ans);
	}

}

```

@@ Response
```python
s = input() + '2'
n = len(s)
ans = n - 1
for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)
print(ans)
```

This Python code does the same thing as the Java code. It reads a string from the user, appends '2' to the end of the string, and then calculates the minimum of the maximum of the two numbers (i + 1 and n - i - 2) for each pair of adjacent characters in the string. The result is printed to the console.<｜end▁of▁sentence｜>
