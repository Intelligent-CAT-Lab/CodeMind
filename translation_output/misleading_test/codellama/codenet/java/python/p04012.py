<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def is_palindrome(word):
    return word == word[::-1]

def main():
    word = sys.stdin.readline().strip()
    if is_palindrome(word):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
This code uses the `is_palindrome` function to check if the input word is a palindrome. The function takes a string as input and returns `True` if the string is a palindrome, and `False` otherwise.

The `main` function reads a line of input from standard input using `sys.stdin.readline()`, strips the newline character at the end of the line, and passes the resulting string to the `is_palindrome` function. If the function returns `True`, the program prints "Yes" to standard output. Otherwise, it prints "No".

The `if __name__ == "__main__":` block is a common idiom in Python that ensures that the `main` function is only executed if the file is run as a script, rather than being imported as a module.</s>
