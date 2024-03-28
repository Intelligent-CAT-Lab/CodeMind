<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBW

Expected output:
-42

```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    count = 0
    black = 0
    for c in s:
        if c == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == '__main__':
    main()
```
This code reads a string from standard input using `sys.stdin.readline()`, strips the newline character at the end, and then iterates over the characters in the string using a for loop. For each character, it checks if it is 'W', and if so, it adds the current value of `black` to `count`. If the character is not 'W', it increments `black` by 1. Finally, it prints the value of `count` to standard output.</s>
