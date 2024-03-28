<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abaccaba

Expected output:
Yes


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
```python
def is_palindrome(s):
    count = [0] * 256
    for i in s:
        count[ord(i)] += 1
    odd = 0
    for i in count:
        if i % 2 == 1:
            odd += 1
        if odd > 1:
            return "No"
    return "Yes"

print(is_palindrome(input()))
```

This Python code works by creating a count array of size 256 (which is the number of ASCII characters) and incrementing the count of each character in the input string. Then it checks if any count is odd. If more than one count is odd, it returns "No", otherwise it returns "Yes".<｜end▁of▁sentence｜>
