<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
Yes


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
```
import sys

N = sys.stdin.readline().strip()

for i, c in enumerate(N):
    if i % 2 == 0:
        if c == 'L':
            print("No")
            break
    else:
        if c == 'R':
            print("No")
            break
    if i == len(N) - 1:
        print("Yes")
```
This code reads a string `N` from standard input, and then iterates over the characters in the string using a for loop. For each character, it checks if it is a 'L' or 'R' and if it is in an even or odd position. If it finds a 'L' or 'R' in an even position or a 'R' or 'L' in an odd position, it prints "No" and breaks out of the loop. If it reaches the end of the string without finding any invalid characters, it prints "Yes".</s>
