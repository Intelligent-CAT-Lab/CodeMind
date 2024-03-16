<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
s += '2'
n = len(s)
ans = n - 1
for i in range(n - 1):
    if s[i] != s[i + 1]:
        tmp = max(i + 1, n - i - 2)
        ans = min(ans, tmp)
print(ans)
```
Note: The `sys.stdin.readline()` method is used to read a line from the standard input, and the `strip()` method is used to remove any trailing whitespace from the input string. The `+=` operator is used to concatenate the string with the character `'2'`. The `len()` function is used to get the length of the string, and the `range()` function is used to iterate over the indices of the string. The `min()` and `max()` functions are used to find the minimum and maximum values of the `ans` variable, respectively. The `print()` function is used to print the final result.</s>
