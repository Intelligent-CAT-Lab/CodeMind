<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes


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
```python
import sys

def check_four_chars(s):
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        return "Yes"
    else:
        return "No"

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(check_four_chars(s))
```

In this Python code, we define a function `check_four_chars` that takes a string `s` as input, sorts the characters in the string, and checks if the first two characters are equal and the last two characters are equal and not equal. If all these conditions are met, it returns "Yes", otherwise it returns "No".

Then, we read the input string from the standard input, strip any trailing newline characters, and pass it to the `check_four_chars` function. The result is printed to the standard output.<｜end▁of▁sentence｜>
