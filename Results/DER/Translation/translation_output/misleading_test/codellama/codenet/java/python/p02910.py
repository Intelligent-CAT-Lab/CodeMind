<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
5>/

```
import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
				System.out.println("Yes");
			}
		}
	}

}
```
[/INST]
```python
import sys

def is_valid(s):
    if len(s) % 2 == 0:
        if 'L' in s:
            return False
    else:
        if 'R' in s:
            return False
    return True

if __name__ == '__main__':
    s = sys.stdin.readline().strip()
    if is_valid(s):
        print("Yes")
    else:
        print("No")
```
This code reads a string from standard input using `sys.stdin.readline()`, strips the newline character at the end, and then checks if the string is valid using the `is_valid()` function. If the string is valid, it prints "Yes", otherwise it prints "No".

The `is_valid()` function checks if the length of the string is even or odd, and then checks if the string contains the character 'L' or 'R' depending on the length. If the string is valid, it returns `True`, otherwise it returns `False`.</s>
