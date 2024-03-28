<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

@@ Response
```python
import sys

def abbreviate(s):
    leng = len(s)
    return s[0] + str(leng-2) + s[-1]

if __name__ == "__main__":
    s = sys.stdin.readline().strip()
    print(abbreviate(s))
```

In this Python code, we define a function `abbreviate` that takes a string `s` as input and returns the abbreviated string. The abbreviation is the first character of the string, followed by the length of the string minus 2, and then the last character of the string.

In the main part of the code, we read a string from the standard input, strip any trailing newline characters, and pass it to the `abbreviate` function. The result is printed to the standard output.<｜end▁of▁sentence｜>
