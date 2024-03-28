<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
pdbq

Expected output:
Yes


```
import java.util.*;

public class p03889 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'b') {
				arr[i] = 'd';
			} else if (arr[i] == 'd') {
				arr[i] = 'b';
			} else if (arr[i] == 'p') {
				arr[i] = 'q';
			} else if (arr[i] == 'q') {
				arr[i] = 'p';
			}
		}
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
		if (s.equals(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

```

### Response:
```python
def is_palindrome(s):
    s = list(s)
    for i in range(len(s)):
        if s[i] == 'b':
            s[i] = 'd'
        elif s[i] == 'd':
            s[i] = 'b'
        elif s[i] == 'p':
            s[i] = 'q'
        elif s[i] == 'q':
            s[i] = 'p'
    s = ''.join(s[::-1])
    if s == s[::-1]:
        return "Yes"
    else:
        return "No"

print(is_palindrome(input()))
```

This Python code does the same thing as the Java code. It reads a string from the input, replaces 'b' with 'd' and 'd' with 'b', 'p' with 'q' and 'q' with 'p', and checks if the string is a palindrome. If it is, it prints "Yes", otherwise it prints "No".
<|EOT|>
