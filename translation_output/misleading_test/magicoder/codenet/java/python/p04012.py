<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
rYes

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

@@ Response
Here is the equivalent Python code:

```python
def is_palindrome(s):
    count = [0] * 26
    for char in s:
        count[ord(char) - ord('a')] += 1
    odd_count = sum(1 for i in count if i % 2 != 0)
    return odd_count <= 1

s = input()
print("Yes" if is_palindrome(s) else "No")
```

This Python code works by counting the occurrences of each character in the string. It then checks if there are more than one characters that occur an odd number of times. If there is, it returns "No", otherwise it returns "Yes".<｜end▁of▁sentence｜>
