<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
B6M

```
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

```

@@ Response
Here is the Python version of the given Java code:

```python
def main():
    s = input()
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, sorts the characters in the string, and then checks if the first two characters are the same and the last two characters are the same and the first two characters are not the same as the last two characters. If all these conditions are met, it prints "Yes". Otherwise, it prints "No".<｜end▁of▁sentence｜>
