<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

s = sys.stdin.readline().strip()
s = sorted(s)
if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
    print("Yes")
else:
    print("No")
```
This code reads a line of input from the user, sorts the characters in the line, and then checks if the first two characters are the same, the third and fourth characters are the same, and the second and third characters are different. If all of these conditions are met, it prints "Yes", otherwise it prints "No".</s>
